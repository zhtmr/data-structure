package doit;

import jdk.internal.org.objectweb.asm.Handle;

public class Ex {

  static class Box<T> {

    private T ob;

    public void set(T o) {
      ob = o;
    }
    public T get() {
      return ob;
    }
  }

  static class Toy extends Plastic{

    @Override
    public String toString() {
      return "dfdfdfd";
    }
  }

  static class Car extends Toy{}
  static class Robot extends Toy{}
  static class Plastic{}


  private static class Handler{

    // 상한제한
    public static void outBox(Box<? extends Toy> box, Toy n){
      Toy toy = box.get(); // 최상위 타입인 Toy로 받을수 있다.
//      box.set(n); // Box<Car>, Box<Robot> ... 뭐가 올지 모른다
    }


    // 하한제한
    public static void inBox(Box<? super Toy> box, Toy n){ // Plastic n 컴파일 불가능
      // <? super Toy> 로 제한하면 Toy ~ Plastic 중에 뭐가 올지 모름. set() 에 Toy 가 들어가면
      // Box<Toy> 에 들어갈수 있는건 모두 가능하다. (Car, Toy, Robot).
      // 그러나 Box<Toy> 인데 set()에 Plastic 이 오면 자식타입에 부모타입을 담게되므로 컴파일 불가
      box.set(n);
//    Object object = box.get();
//    Object 로 받는건 오류 위험성이 있다. Box<Toy>, Box<Plastic> 둘 중 뭐가 올지 모름.
//    Toy 가 오면 Plastic, Toy 타입 둘다 되지만, Plastic 이 왔을땐 Toy 타입은 안된다.
//    컴파일 단계에서 리턴타입을 정할 수 없기때문에 오류
    }

    /*
    *   결국 Box<?> 에서 ? 의 범위를 두게 되면(<? super Toy>, <? extends Toy>) class Box<T> 의 타입이 결정되지 않는다는 방식으로
    *   의도적으로 컴파일 오류를 일으켜 코드의 안전성을 높인다.
    * */
  }

  public static void main(String[] args) {
    Box<Plastic> plasticBox = new Box<>();
    Box<Toy> toyBox = new Box<>();
    Box<Car> carBox = new Box<>();

    Handler.inBox(plasticBox,new Car());

  }
}