package doit;

import java.util.Scanner;

public class Ex16 {

  static void spira(int n) {
    for (int i = 0; i < n; i++) {
      for (int k = i; k < n-1; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int n;
    do{
      System.out.println("단 수 : ");
      n = kb.nextInt();
    }while (n<=0);

    spira(n);
  }
}
