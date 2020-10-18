package goh.lesson1;

import java.util.Scanner;

public class TaskSet8 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];

    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt();
    }
    kb.close();

//    for (int i = n - 1; i > 0; i--) {
//      for (int j = 0; j < i; j++) {
//        if (data[j] > data[j + 1]) {
//          int tmp = data[j + 1];
//          data[j + 1] = data[j];
//          data[j] = tmp;
//        }
//      }
//    }
//
//    for (int i = 0; i < n - 1; i++) {
//      if (data[i] == data[i + 1]) {
//        for (int k = 0; k < n - 1; k++) {
//          data[k] = data[k + 1];
//        }
//      }
//    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j && data[i] == data[j]) {
          data[j] = 0;
        }
      }
    }

    for (int i = n - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (data[j] > data[j + 1]) {
          int tmp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = tmp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (data[i] > 0) {
        System.out.print(data[i] + " ");
      }
    }
  }
}
