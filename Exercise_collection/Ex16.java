import java.util.HashMap;

public class Ex16 {
  public static void main(String[] args) {
    HashMap<String,Integer> samp = new HashMap<>();
    samp.put("hoge",250);
    samp.put("foo",300);
    samp.put("bar",120);
    System.out.println(samp.toString());
    System.out.print("追加key>>");
    String key = new java.util.Scanner(System.in).nextLine();
    System.out.print("追加value>>");
    Integer value  = new java.util.Scanner(System.in).nextInt();
    samp.put(key,value);
    System.out.println(samp.toString());
    System.out.print("削除key>>");
    key = new java.util.Scanner(System.in).nextLine();
    samp.remove(key);
    System.out.println(samp.toString());
  }
}
