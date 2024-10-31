import java.util.ArrayList;
import java.util.HashMap;

public class Ex40 {
  public static void main(String[] args) {
    HashMap<String,ArrayList<HashMap<String,String>>> accounts = new HashMap<>();
    ArrayList<HashMap<String,String>> contents = new ArrayList<>();
    HashMap<String,String> items = new HashMap<>();
    items.put("mail","tanaka@example.com");
    items.put("name","田中");
    contents.add(items);
    items = new HashMap<>();
    items.put("mail","suzuki@example.com");
    items.put("name","鈴木");
    contents.add(items);
    accounts.put("class1",contents);

    contents = new ArrayList<>();
    items = new HashMap<>();
    items.put("mail","sato@example.com");
    items.put("name","佐藤");
    contents.add(items);
    accounts.put("class2",contents);

    contents = new ArrayList<>();
    items = new HashMap<>();
    items.put("mail","suzuki@example.com");
    items.put("name","鈴木");
    contents.add(items);
    accounts.put("class3",contents);

    System.out.println(accounts.toString());
    System.out.print(">>");
    String s = new java.util.Scanner(System.in).nextLine();
    ArrayList<String> res_class = new ArrayList<>();
    boolean output = false;
    for (String key : accounts.keySet()) {
      ArrayList<HashMap<String,String>> list = accounts.get(key);
      for (HashMap<String,String> map : list) {
        if (map.get("mail").equals(s)) {
          if (!output) {
            System.out.println("メールアドレス："+s);
            System.out.println("名前："+map.get("name"));
            output=true;
          }
          res_class.add(key);
        }
      }
    }
    if (!output) {
      System.out.println("メールアドレス："+s);
      System.out.println("名前：ありません");
    }
    System.out.println("所属クラス："+res_class.toString());
  }
}
