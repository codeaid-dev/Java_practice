import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.TreeMap;

public class CollectionSample {
  public static void main(String[] args) {
    ArrayList<String> arraylist = new ArrayList<String>();
    LinkedList<String> linkedlist = new LinkedList<String>();
    arraylist.add("桜");
    arraylist.add("ひまわり");
    arraylist.add("紅葉");
    System.out.println("ArrayList: "+arraylist.toString());
    linkedlist.add("梅");
    linkedlist.add("コスモス");
    linkedlist.add("銀杏");
    System.out.println("LinkedList: "+linkedlist.toString());

    String[] foo1 = {"大福", "団子", "まんじゅう", "おはぎ"};
    HashSet<String> hashset = new HashSet<String>();
    for (int i=0; i<foo1.length; i++) {
      hashset.add(foo1[i]);
    }
    hashset.add("大福"); // 重複した要素の追加
    hashset.add(null); // nullの追加
    System.out.println("HashSet: "+hashset.toString());
    LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
    for (int i=0; i<foo1.length; i++) {
      linkedhashset.add(foo1[i]);
    }
    linkedhashset.add("大福"); // 重複した要素の追加
    linkedhashset.add(null); // nullの追加
    System.out.println("LinkedHashSet: "+linkedhashset.toString());
    TreeSet<String> treeset = new TreeSet<String>();
    for (int i=0; i<foo1.length; i++) {
      treeset.add(foo1[i]);
    }
    treeset.add("大福"); // 重複した要素の追加
    System.out.println("TreeSet: "+treeset.toString());

    String[] foo2 = {"ケーキ", "プリン", "アイス", "チョコレート"};
    HashMap<String, String> hashmap = new HashMap<String, String>();
    LinkedHashMap<String, String> linkedhashmap = new LinkedHashMap<String, String>();
    TreeMap<String, String> treemap = new TreeMap<String, String>();
    for (int i=foo2.length; i>0; i--) {
      hashmap.put(String.valueOf(i), foo2[i-1]);
      linkedhashmap.put(String.valueOf(i), foo2[i-1]);
      treemap.put(String.valueOf(i), foo2[i-1]);
    }
    /*for (int i=0; i<foo2.length; i++) {
      hashmap.put(String.valueOf(i+1), foo2[i]);
      linkedhashmap.put(String.valueOf(i+1), foo2[i]);
      treemap.put(String.valueOf(i+1), foo2[i]);
    }*/
    System.out.println("HashMap: "+hashmap.toString());
    System.out.println("LinkedHashMap: "+linkedhashmap.toString());
    System.out.println("TreeMap: "+treemap.toString());
  }
}
