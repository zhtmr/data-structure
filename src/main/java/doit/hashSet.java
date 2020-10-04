package doit;

import java.util.HashSet;
import java.util.Objects;
// 다른 인스턴스(new Num()) 인데도 중복으로 판단하게 만들기.

// hashSet() 에서 중복을 판단하는 기준은 무엇인가?
// hashSet 은 객체를 저장하기 전에 equals(), hashCode() 로 비교 후 저장함
public class hashSet {
  private int num;
  public hashSet(int n){ num = n;}

  @Override
  public String toString() {
    return String.valueOf(num);
  }

  // 값이 같은가?
  @Override
  public boolean equals(Object o) {
    if (num == ((hashSet) o).num){
      return true;
    }else
      return false;
  }

  // 참조값이 같은가? categorize
  @Override
  public int hashCode() {
    return Objects.hash(num); // java.util.Objects 의 hash()가 알아서 num 에 대한 해쉬값을 리턴해준다.
  }

  public static void main(String[] args) {
    HashSet<hashSet> set = new HashSet<>();
    // 위에 오버라이드 된 hashCode()에 의해 7799 는 같은 해쉬코드를 가진다.
    set.add(new hashSet(7799));
    set.add(new hashSet(9955));
    set.add(new hashSet(7799));

    System.out.println(set.size()); // 2

    for (hashSet num : set) {
      System.out.println(num);
    } // 9955, 7799
  }
}
