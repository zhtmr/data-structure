import java.util.Scanner;

public class Code9 {

  public static void main(final String[] args) {
    final Scanner kb = new Scanner(System.in); // 입력
    final int n = kb.nextInt(); // 몇개 입력받을지?
    final int[] data = new int[n]; // 입력한 숫자 저장할 배열

    for (int i = 0; i < n; i++)
      data[i] = kb.nextInt();
    kb.close();

    final int tmp = data[n - 1]; // 맨 마지막 숫자 따로 보관
    for (int i=n-2; i>=0; i--) // 맨 마지막 숫자를 제외한 맨 뒤 숫자부터
      data[i+1]=data[i];
    data[0]=tmp; // 맨 처음숫자에 맨 끝 숫자 넣기

    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i]);
    }
  }
}
