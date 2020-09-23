package doit;

import java.util.Scanner;

public class Ex15 {

  // LB
  static void triangleLB(int n) {
    System.out.print("LB");
    for (int i = 0; i <= n + 1; i++) {
      System.out.print("-");
    }
    System.out.println();

    for (int i = 0; i < n; i++) {
      System.out.print("| ");
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = i; k < n; k++) {
        System.out.print(" ");
        if (k == n - 1) {
          System.out.print("|");
        }
      }
      System.out.println();

    }
    for (int j = 0; j <= n + 3; j++) {
      System.out.print("-");
    }
  }

  // LU
  static void triangleLU(int n) {
    System.out.print("LU");
    for (int i = 0; i <= n + 1; i++) {
      System.out.print("-");
    }
    System.out.println();

    for (int i = 0; i < n; i++) {
      System.out.print("| ");
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(" ");
        if (k == i) {
          System.out.print("|");
        }
      }
      System.out.println();
    }
    for (int j = 0; j <= n + 3; j++) {
      System.out.print("-");
    }
  }

  // RU
  static void trinangleRU(int n) {
    System.out.print("RU");
    for (int i = 0; i <= n + 1; i++) {
      System.out.print("-");
    }
    System.out.println();

    for (int i = 0; i < n; i++) {
      System.out.print("| ");
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.print(" |");
      System.out.println();
    }
    for (int j = 0; j <= n + 3; j++) {
      System.out.print("-");
    }
  }

  // RB
  static void triangleRB(int n) {
    System.out.print("RB");
    for (int i = 0; i <= n + 1; i++) {
      System.out.print("-");
    }
    System.out.println();

    for (int i = 0; i < n; i++) {
      System.out.print("| ");
      for (int k = 1; k < n - i; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.print(" |");
      System.out.println();
    }
    for (int j = 0; j <= n + 3; j++) {
      System.out.print("-");
    }
  }


  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n;

    do {
      System.out.println("단수 : ");
      n = kb.nextInt();
    } while (n <= 0);

    triangleLB(n);
    System.out.println();
    triangleLU(n);
    System.out.println();
    trinangleRU(n);
    System.out.println();
    triangleRB(n);

  }
}
