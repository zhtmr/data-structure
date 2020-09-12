import java.util.Scanner;

public class TaskSet3 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];
    for (int i = 0; i <n ; i++) {
      data[i] = kb.nextInt();
    }

    int sum = 0;
    int sum1 =0;
    for (int i = 0; i < n; i++) {
      if (data[i]%2 == 0)
        sum += data[i];
      else
        sum1 += data[i];
    }
    System.out.println(sum - sum1);
    kb.close();


  }
}
