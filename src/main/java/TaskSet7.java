import java.util.Scanner;

public class TaskSet7 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];

    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt();
    }
    kb.close();

    for (int i = 0; i < n; i++) { // 모든 수의 차이를 비교해본다
      for (int j = i + 1; j < n; j++) {
        if (data[i] < data[j]) {
          int tmp = data[j];
          data[j] = data[i];
          data[i] = tmp;
        }
        int gap = data[i] - data[j];
        if (data[i] != data[j] && gap < ) {
           = gap;
        }
      }
    }
    for (int k = 0; k < n; k++) {
      System.out.print(data[k] + " ");
    }
  }
}
