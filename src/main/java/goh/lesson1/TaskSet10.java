package goh.lesson1;



public class TaskSet10 {

  public static void main(String[] args) {
    int[][] gugudan = new int[10][10];   // 2차원 배열 선언

    for (int i = 2; i < gugudan.length; i++) {
      System.out.println(i + "단");
      System.out.println(gugudan[i].length);

      for (int j = 1; j < gugudan[i].length; j++) {
        gugudan[i][j] = i * j;

        System.out.print(i + "x" + j + "=" + gugudan[i][j] + "//");
        // 배열 출력
        if (j == 9) {
          System.out.println("\n");     // i x j(9)가 되면 줄 건너뛰기
        }
      }
    }
  }
}

