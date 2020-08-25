import java.util.Scanner;

public class Code8 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); // 입력
    int n = kb.nextInt(); // 몇개 입력받을지?
    int[] data = new int[n]; // 입력한 숫자 저장할 배열

    for (int i=0; i<n; i++)
      data[i] = kb.nextInt();
    kb.close();

    int sum=0, max=data[0];
    for (int i=0;i<n;i++) {
      sum += data[i];
      if(data[i]>max) max=data[i];
    }
    System.out.println("sum is : "+sum+" max is : "+max);

  }
}
