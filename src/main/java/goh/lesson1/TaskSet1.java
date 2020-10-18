package goh.lesson1;

public class TaskSet1 {

  public static void main(String[] args) {

    int count = 0;
    for (int n = 2; n <= 100000; n++) {
      boolean isP = true;
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          isP = false;
          break;
        }
      }
      if (isP) {
        count++;
      }
    }
    System.out.println(count);
  }
}



