import java.util.Scanner;

public class TaskSet9 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];
    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt();
    }
    kb.close();

    for (int i = n - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (j % 2 == 1 && data[j] > data[j+2]) {
          int tmp = data[j];
          data[j] = data[j+2];
          data[j+2] = tmp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(data[i] + " ");
    }
  }
}
