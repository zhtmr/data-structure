package doit;

import java.util.Scanner;

public class Ex9 {

  static int sumof(int a, int b) {
    int min, max;
    if (a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }

    int sum = 0;
    for (int i = min; i <= max; i++)
      sum += i;
    return sum;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int a = kb.nextInt();
    int b = kb.nextInt();
    System.out.println(sumof(a, b));

  }
}
