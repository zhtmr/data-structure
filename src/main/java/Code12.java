import java.util.Scanner;

public class Code12 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt(); // 숫자 입력받음
    int[] data = new int[n]; // 해당 숫자 크기의 배열

    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt(); // 각 배열에 숫자 입력
    }
    kb.close();

    int max=0;
    for (int i = 0; i < n; i++) {
      int sum=0;
      for (int j = i; j < n; j++) {
          sum+=data[j];
        if (sum>max)
          max=sum;
      }
    }
    System.out.println(max);
        
      
    
  }
}
