import java.util.Scanner;

public class TaskSet6 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    long val = 1L;
//  long result = 0L;
    while(n > val){
      val *=2;
    }
    System.out.println(val);


//    for (int i = 0; i < n; i++) {
//      val *= 2;
//
//      if (n > val) {
//        result = val * 2;
//      }
//    }
//    System.out.println(result);
  }
}
