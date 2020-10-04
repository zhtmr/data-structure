package doit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration {

  public static void main(String[] args) {

    HashMap<Integer, String> map = new HashMap<>();
    map.put(1,"a");
    map.put(2,"b");
    map.put(3,"c");
    map.put(4,"d");


    // 1. entrySet()
    Set<Entry<Integer, String>> entries = map.entrySet();

    for (Entry<Integer, String> entry : entries) {
      System.out.println(entry.getKey()+" , "+entry.getValue());
    }
    System.out.println();

    // 2. keySet()
    Set<Integer> ks = map.keySet();

    for (Integer n : ks) {
      String v = map.get(n);
      System.out.println(n+" , "+v);
    }
    System.out.println();

    //3. iterator()
    Iterator<Integer> iteratorK = ks.iterator();
    Iterator<Entry<Integer, String>> iteratorE = entries.iterator();

    while (iteratorE.hasNext()) {
      Entry<Integer, String> next = iteratorE.next();
      System.out.println(next.getKey()+" , "+next.getValue());
    }
    System.out.println();
  }

}
