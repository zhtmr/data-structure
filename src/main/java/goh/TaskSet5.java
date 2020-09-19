package goh;

import java.util.Scanner;

public class TaskSet5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];

    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt();
    }
    kb.close();

    int max =data[0] , min = data[0];
    for (int i = 0; i < n; i++) {
      if (data[i] > max) {
        max = data[i];
      }
      if (data[i] < min)
        min = data[i];
    }
    System.out.println(max-min);
  }
}
