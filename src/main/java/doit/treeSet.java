package doit;

import java.util.Arrays;
import java.util.TreeSet;

public class treeSet {

  static class Person implements Comparable<Person> {

    private final String name;
    private final int age;

    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
    }

    @Override
    public int compareTo(Person o) {
      return -(this.age - o.age); // 내림차순 <-> this.age - o.age 오름차순
    }
  }
  public static int[] solution(int money) {

    int[] answer = new int[9]; //정답
    int[] sort_money = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};//지폐종류

    for (int i = 0; i < sort_money.length; i++) {
      if (i == 0) {
        answer[i] = (money / sort_money[i]);
      } else {
        answer[i] = (money % sort_money[i - 1]) / sort_money[i];
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(50382)));

//    TreeSet<Person> people = new TreeSet<>();
//    people.add(new Person("b", 2));
//    people.add(new Person("a", 1));
//    people.add(new Person("c", 3));
//
//    for (Person p : people) {
//      System.out.println(p);
//    }
//
//    TreeSet<Integer> tree = new TreeSet<>();
//    tree.add(3);
//    tree.add(2);
//    tree.add(4);
//    tree.add(1);
//
//    System.out.println("사이즈 : " + tree.size());
//
//    for (Integer o : tree) {
//      System.out.println(o);
//    }


  }
}
