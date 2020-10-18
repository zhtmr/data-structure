package goh.lesson2;

public class Code17 {

  public static void main(String[] args) {
    // 소수찾기
    for (int n = 2; n <= 100000; n++) {
      if (isPrime(n)) {
        System.out.println(n);
      }
    }
  }


  static boolean isPrime(int k) {
    if (k < 2) {
      return false;
    }
    for (int i = 2; i * i <= k; i++) {
      if (k % i == 0) {
        return false;
      }
    }
    return true;
  }
}
