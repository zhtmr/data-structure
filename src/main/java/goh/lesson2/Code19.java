package goh.lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

  public static void main(String[] args) {

    String[] name = new String[1000]; // 배열크기를 넉넉하게 준다
    String[] num = new String[1000];
    int n = 0; // 사람 수

    try {
      Scanner inFile = new Scanner(new File("input.txt"));

      while (inFile.hasNext()){
        name[n] = inFile.next();
        num[n] = inFile.next();
        n++;
      }

      inFile.close();

    } catch (FileNotFoundException e) { // 파일이 없으면
      System.out.println("NO file");
      System.exit(9); // 0: 정상종료 , 이외 : 비정상적 종료
    }

    for (int i = 0; i < n; i++) {
      System.out.println(name[i]+": "+num[i]);
    }

  }
}
