package doit;

import java.util.Scanner;

public class Ex11 {

  public static void main(String[] args) {

    Scanner stdIn = new Scanner(System.in);
    int n;

    do {
      System.out.println("정수값 : ");
      n = stdIn.nextInt();
    } while (n <= 0);

    int no = 0;
    while (n > 0) {
      n /= 10;
      no++;
    }

    System.out.println(no+"자리");

  }
}
