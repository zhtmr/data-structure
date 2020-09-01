import java.util.Scanner;

public class TaskSet2 {

  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    for (int i = 2; i <= 100000; i++) {
      boolean isP = true;
      for (int j = 2; j * j < i; j++) {
        if (i % j == 0) {
          isP = false;
          break;
        }
      }
      if (isP) {
        count++;
        if (count <= 50) {
//          System.out.println(i);
          sum += i;
        }
      }
    }
    System.out.println();
    System.out.println("합: " + sum);

    System.out.println("-----------------");

    // 1.
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("-----------------");

    // 2-1.
    for (int i = 1; i < 5; i++) { // 몇 줄 찍을건지
      for (int j = 4; j > 0; j--) { // 한 줄에 별 몇개찍을건지
        if (i < j) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }

    System.out.println("-----------------");

    // 2-2.
    for (int i = 0; i < 4; i++) { // 4줄찍는다
      for (int j = 0; j < 3 - i; j++) { // 공백은 3개,2개,1개 순으로 줄어든다
        System.out.print(" ");
      }
      for (int k = 0; k < i + 1; k++) { // 별이 1개,2개,3개.. 늘어남
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("-----------------");

    // 3.
    for (int i = 0; i < 4; i++) {
      for (int k = 0; k < 4 - i; k++) { // 앞쪽의 공백이 하나씩 줄어들게.
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("-----------------");

    // 4-1.
    for (int i = 0; i < 4; i++) {
      for (int j = 4; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("-----------------");

    // 4-2.
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("-----------------");

    // 5.
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 4 - i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("-----------------");

    // 6.
    for (int i = 0; i < 4; i++) {
      for (int j = i; j < 5; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < i + 3; j++) {
        System.out.print(" ");
      }
      for (int k = 2 * i + 1; k < 6; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("-----------------");

    // 7.
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= 3 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = i; k <= 3; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println("-----------------");

    // 8-1.
    System.out.println("홀수를 입력해주세요");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (i <= num / 2)// 위쪽 영역
        {
          if (i + j <= num / 2 - 1)// 왼쪽 위 공백찍기
          {
            System.out.print(" ");
          } else if (j - i >= num / 2 + 1) // 오른쪽 위 공백찍기
          {
            System.out.print(" ");
          } else {
            System.out.print("*");// *찍기
          }
        } else if (i > num / 2) //아래쪽 영역
        {
          if (i - j >= num / 2 + 1) //왼쪽 밑 공백
          {
            System.out.print(" ");
          } else if (i + j >= num / 2 * 3 + 1)//오른쪽 밑 공백
          {
            System.out.print(" ");
          } else {
            System.out.print("*"); // *찍기
          }
        }
      }
      System.out.println();//줄바꿈
    }

    System.out.println("-----------------");

    // 8-2.
    System.out.println("홀수를 입력해주세요");
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    for (int i = 0; i <= n / 2; i++) {
      for (int j = i; j < n / 2; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < (n - 1) / 2; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(" ");
      }
      for (int k = 2 * i + 1; k < n - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("-----------------");
  }
}
