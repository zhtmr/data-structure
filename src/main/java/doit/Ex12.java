package doit;

import java.util.Scanner;

public class Ex12 {

  public static void main(String[] args) {

    System.out.print("   |");
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%3d",i);
    }
    System.out.println();
    System.out.println("---+----------------------------");

    for (int i = 1; i <= 9; i++) {
      System.out.printf(" %2d|",i);
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%3d",i*j);
      }
      System.out.println();
    }
    System.out.println();

    System.out.print("   |");
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%3d",i);
    }
    System.out.println();
    System.out.println("---+----------------------------");
    for (int i = 1; i <= 9; i++) {
      System.out.printf(" %2d|",i);
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%3d",i+j);
      }
      System.out.println();
    }

    System.out.println();

    System.out.println("사각형을 출력합니다.");

    System.out.println("단수 : ");
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
