import java.util.ArrayList;

public class ListSample {
  public static void main(String[] args) {
    ArrayList<String> arraylist = new ArrayList<String>();
    arraylist.add("桜");
    arraylist.add("ひまわり");
    arraylist.add("紅葉");
    System.out.println("arraylist: "+arraylist);
    String str = arraylist.get(1);
    System.out.println("arraylist[1]: "+str);
    System.out.println("arraylist size: "+arraylist.size());
    arraylist.set(1, "あさがお");
    System.out.println("arraylist: "+arraylist);
    ArrayList<String> copylist = new ArrayList<String>(arraylist);
    System.out.println("copylist: "+copylist);
    arraylist.set(1, "ひまわり");
    System.out.println("arraylist: "+arraylist);
    System.out.println("copylist: "+copylist);
    arraylist.clear();
    System.out.println("arraylist: "+arraylist);
    System.out.println("arraylist size: "+arraylist.size());
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (int i=0; i<5; i++) {
      nums.add((int)Math.ceil(Math.random()*10));
    }
    System.out.println("nums: "+nums);
    nums.sort(java.util.Comparator.reverseOrder());
    System.out.println("nums: "+nums);
  }
}
