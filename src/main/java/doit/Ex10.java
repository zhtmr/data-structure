package doit;

import java.util.Scanner;

public class Ex10 {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    int a = kb.nextInt();
    int b = kb.nextInt();

    while (b<=a) {
      System.out.println("a의 값 : " + a);
      System.out.println("b의 값 : " + b);
      System.out.println("a보다 큰 값을 입력하세요");
      b = kb.nextInt();
    }

    System.out.println(b-a);





  }
}
