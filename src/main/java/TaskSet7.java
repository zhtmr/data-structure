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

    //  1. 오름차순 정렬 후 앞에서부터 차례대로 빼기
    int gab;
    int a = 0, b = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (data[i] > data[j]) {
          int tmp = data[j];
          data[j] = data[i];
          data[i] = tmp;
        }
      }
      gab = 21474836;
      for (int k = 0; k < n-1; k++) {
        int gab1 = data[k + 1] - data[k];
        if (gab > gab1 && data[k + 1] != data[k]) {
          gab = gab1;
          a = data[k + 1];
          b = data[k];
        }
      }
    }
    System.out.println(a+" "+b);

    //  2.
    int maxValue = Integer.MAX_VALUE;
    int min_i = 0;
    int min_j = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (data[i] > data[j] && data[i] - data[j] < maxValue) {
          maxValue = data[i] - data[j];
          min_i = data[i];
          min_j = data[j];
        }
      }
    }
    System.out.println(min_i + " " + min_j);

  }
}

