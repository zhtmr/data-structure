public class Code10 {

  public static void main(String[] args) {

    for (int n = 2; n <= 100000; n++) { // 1 ~ 100000 까지 중 소수 찾기

      boolean isP = true;
      for (int i = 2; i * i <= n && isP; i++)// 2부터 나눠본다. (최대 몇까지 for문을 돌릴건지가 관건. 루트 n 까지만해도됨)
        if (n % i == 0) // 나눠떨어지면
          isP = false; // 소수가아님

      if (isP)
        System.out.println(n + " 은 소수다");
    }


  
  }
}
