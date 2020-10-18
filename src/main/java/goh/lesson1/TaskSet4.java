package goh.lesson1;

import java.util.Scanner;

public class TaskSet4 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1 + " ");
      }
      System.out.println();
    }

  }
}
