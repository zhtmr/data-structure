package doit;

import java.util.TreeSet;

public class treeSet {

  public static void main(String[] args) {
    TreeSet<Integer> tree = new TreeSet<>();
    tree.add(3);
    tree.add(2);
    tree.add(4);
    tree.add(1);

    System.out.println("사이즈 : "+tree.size());

    for (Integer o : tree) {
      System.out.println(o);
    }
  }
}
