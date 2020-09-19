package goh;

import java.util.Scanner;

public class Code9 {

  public static void main(final String[] args) {
    Scanner kb = new Scanner(System.in); // 입력
    int n = kb.nextInt(); // 몇개 입력받을지?
    int[] data = new int[n]; // 입력한 숫자 저장할 배열

    for (int i = 0; i < n; i++) {
      data[i] = kb.nextInt();
    }
    kb.close();

    int tmp = data[n - 1]; // 맨 마지막 숫자 따로 보관

    // 맨 마지막 숫자를 제외한 맨 뒤 숫자부터
    for (int i = n - 2; i >= 0; i--) {
      data[i + 1] = data[i];
    }

    /*
      System.arraycopy(data, 0, data, 1, n - 2 + 1);
      ( 원본, 원본에서 어디부터 가져올지, 복사본, 어디부터 쓸지, 어디까지 )

      for문 내용이 기존의 배열을 그대로 참조하고있으면, for문을 또 돌 필요없이 기존 배열에서 필요한 부분만 가져온다.
      예를 들어 int data[] = {1,2,3,4,5} 이면 {5,1,2,3,4} 가 나와야 한다.
      원본data의 처음부터 가져와서 복사본(data)의 1번째 자리(data[i]를 가져와서 data[i+1] 에다가 넣으니까)부터
      n - 2 + 1개를 붙여넣음
    */

    data[0] = tmp; // 맨 처음숫자에 맨 끝 숫자 넣기

    for (int datum : data) {
      System.out.println(datum);
    }
  }
}
