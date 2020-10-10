package doit;

import java.util.ArrayList;
import java.util.List;

public class Person{
  String name;
  // 부모 클래스에 소스코드를 추가(생성자 오버로딩)
  Person(){};
  Person(String name){
    this.name=name;
  }

  public String toString() {
    return name;
  }
}


// Man
class Man extends Person{ // T(Man) 자식클래스
  // String name;
  Man(String name){
    this.name=name; // m.name="임시"
  }
  @Override // 객체의 주소값을 출력시키는 메소드(Object)
  public String toString() {
    // TODO Auto-generated method stub
    return name;
  }
}

// Woman
class Woman extends Person{ // T(Woman) 자식클래스
//   String name;
  Woman(String name){
    this.name=name;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return name;
  }
}




class WildSuper {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Man
    List<Man> list=new ArrayList();
    // Man m=new Man("임시");
    list.add(new Man("임시")); //축약형
    list.add(new Man("테스트"));
//    printData(list); //상속관계가 아님

    // Woman
    List<Woman> list2=new ArrayList();
    list2.add(new Woman("임시2"));
    list2.add(new Woman("테스트2"));
    printData(list2);

    // Person
    List<Person> list3=new ArrayList();
    list3.add(new Person("사장님"));
    list3.add(new Person("이사님"));
    printData(list3);

    // Double
    List<Double> list4=new ArrayList();
    list4.add(12.5); list4.add(22.5); list4.add(14.3);
    //printData(list4);    // 허용되는 자료형이 아님

  }


  // <? super T> 메소드
  public static void printData(List <? super Woman> list) {
    // Woman과 부모인 Person의 데이터만 허용
    for (Object obj : list) // 어떤 자료형이든 받아야하기에 Object형
    {
      System.out.println(obj);
    }
  }


}
