import java.util.ArrayList;
import java.util.List;

public class ListSample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("桜");
    list.add("ひまわり");
    list.add("紅葉");
    System.out.println("list: "+list);
    String str = list.get(1);
    System.out.println("list[1]: "+str);
    System.out.println("list size: "+list.size());
    list.set(1, "あさがお");
    System.out.println("list: "+list);
    List<String> copylist = new ArrayList<String>(list);
    System.out.println("copylist: "+copylist);
    list.set(1, "ひまわり");
    System.out.println("list: "+list);
    System.out.println("copylist: "+copylist);
    list.clear();
    System.out.println("list: "+list);
    System.out.println("list size: "+list.size());
    List<Integer> nums = new ArrayList<Integer>();
    for (int i=0; i<5; i++) {
      nums.add((int)Math.ceil(Math.random()*10));
    }
    System.out.println("nums: "+nums);
    nums.sort(java.util.Comparator.reverseOrder());
    System.out.println("nums: "+nums);
  }
}
