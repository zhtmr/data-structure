package goh;

import java.util.Scanner;

public class Code2 {

  public static void main(String[] args) {
    int num = 123;
    System.out.print("enter int : ");
    Scanner kb = new Scanner(System.in);

    int input = kb.nextInt();
    System.out.println(input == num ? ":-)" : ":-(");
    kb.close();
  }
}
