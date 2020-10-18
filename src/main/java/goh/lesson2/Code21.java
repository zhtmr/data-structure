package goh.lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {

  static int n;
  static int[][] grid;

  public static void main(String[] args) {
    try {
      Scanner inFile = new Scanner(new File("data.txt"));
      n = inFile.nextInt();
      grid = new int[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          grid[i][j] = inFile.nextInt();
//          System.out.print(grid[i][j]+" ");
        }
      }

      inFile.close();

      // 전체
      for (int x = 0; x < n; x++) {
        for (int y = 0; y < n; y++) {
          for (int dir = 0; dir < 8; dir++) {
            for (int len = 1; len <= n; len++) {
              int val = computeValue(x, y, dir, len);
              if (val != -1 && isPrime(val)) {
                System.out.println(val);
              }
            }
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("파일없잖아");
    }
  }

  private static boolean isPrime(int val) {
    boolean isP = true;
    for (int i = 2; i * i <= val; i++) {
      if (val % i == 0) {
        isP = false;
        break;
      }
    }
    return isP;
  }

  // 수열을 정수로
  private static int computeValue(int x, int y, int dir, int len) {
    int value = 0;
    for (int i = 0; i < len; i++) {
      int digit = getDigit(x, y, dir, i);
      if (digit == -1) {
        return -1;
      }
      value = value * 10 + digit;
    }
    return value;
  }

  // 방향으로 k만큼 갔을때 숫자
  private static int getDigit(int x, int y, int dir, int k) {
    int newX = x, newY = y;
    switch (dir) {
      case 0:
        newY -= k;
        break;
      case 1:
        newX += k;
        newY -= k;
        break;
      case 2:
        newX += k;
        break;
      case 3:
        newX += k;
        newY += k;
        break;
      case 4:
        newY += k;
        break;
      case 5:
        newX -= k;
        newY += k;
        break;
      case 6:
        newX -= k;
        break;
      case 7:
        newX -= k;
        newY -= k;
        break;
    }
    // 0보다 작거나 n보다 클경우
    if (newX < 0 || newX >= n || newY < 0 || newY >= n) {
      return -1;
    }
    return grid[newX][newY];
  }
}
