package doit;

public class Ex17 {

  static void npira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int k = i; k <= n-1; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i-1)*2+1; j++) {
        System.out.print(i%10);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
npira(6);
  }
}
