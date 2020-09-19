package doit;

import java.util.Scanner;

public class Ex8 {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

//    int half = n/2;

    int sum = (1 + n) * (n / 2); // n이 홀수인경우 + (n+1)/2 해줘야함.
    // (1 + n) * (n / 2) + (n % 2 == 1 ? (n + 1)/2 : 0)

    int sum1 = (1 + n) * n / 2; // n * (n + 1) / 2

    System.out.println("잘못된 sum : " + sum);
    System.out.println("n/2 : " + n / 2);
    System.out.println("제대로 된 sum : " + sum1);

  }
}
