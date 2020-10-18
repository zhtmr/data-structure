package goh.lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import sun.security.mscapi.CPublicKey;

public class Code20 {

  static String[] name = new String[1000]; // 배열크기를 넉넉하게 준다
  static String[] num = new String[1000];
  static int n = 0; // 사람 수

  public static void main(String[] args) {
    try {
      Scanner inFile = new Scanner(new File("input.txt"));

      while (inFile.hasNext()) {
        name[n] = inFile.next();
        num[n] = inFile.next();
        n++;
      }

      inFile.close();

    } catch (FileNotFoundException e) {
      System.out.println("NO file");
      System.exit(9);
    }

    bubbleSort();

    for (int i = 0; i < n; i++) {
      System.out.println(name[i] + ": " + num[i]);
    }
  }

  static void bubbleSort() {
    for (int i = n - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (name[j].compareToIgnoreCase(name[j + 1]) > 0) {
          String tmp = name[j];
          name[j] = name[j + 1];
          name[j + 1] = tmp;

          tmp = num[j];
          num[j] = num[j + 1];
          num[j + 1] = tmp;
        }
      }
    }
  }
}
