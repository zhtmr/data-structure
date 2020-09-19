package goh;

import java.util.Scanner;

public class TaskSet10 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];
    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt();
    }

    int k = kb.nextInt();
    kb.close();
  }
}
