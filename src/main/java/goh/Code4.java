package goh;

import static java.lang.System.out;

import java.util.Scanner;

public class Code4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please type your name and your age and your gender: ");
    String name = keyboard.next();
    int age = keyboard.nextInt();
    String gender = keyboard.next();
    if (gender.equals("male")) {
      System.out.println(name + ", you’re" + age + "years old man.");
    } else if (gender.equals("female")) {
      System.out.println(name + ", you’re " + age + "years old woman.");
    } else
      out.println("Hmm... interesting.");
    keyboard.close();
  }
}
