import java.util.HashMap;
import java.util.Map;

public class Ex16 {
  public static void main(String[] args) {
    Map<String,Integer> samp = new HashMap<>();
    samp.put("hoge",250);
    samp.put("foo",300);
    samp.put("bar",120);
    System.out.println(samp.toString());
    System.out.print("追加key>>");
    String key = new java.util.Scanner(System.in).nextLine();
//    String key = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("追加value>>");
    Integer value  = new java.util.Scanner(System.in).nextInt();
//    Integer value  = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    samp.put(key,value);
    System.out.println(samp.toString());
    System.out.print("削除key>>");
    key = new java.util.Scanner(System.in).nextLine();
//    key = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    samp.remove(key);
    System.out.println(samp.toString());
  }
}
