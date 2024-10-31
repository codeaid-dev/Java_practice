import java.util.HashMap;

public class Ex15 {
  public static void main(String[] args) {
    HashMap<String,Integer> menu1 = new HashMap<>();
    HashMap<String,Integer> menu2 = new HashMap<>();
    menu1.put("coffee",250);
    menu1.put("sandwich",380);
    menu1.put("salad",180);
    menu2.put("cake",300);
    menu2.put("parfait",400);
    menu1.putAll(menu2);
    System.out.println(menu1.toString());
    Integer total=0;
    for (Integer n : menu1.values()) {
      total += n;
    }
    System.out.println("合計："+total);
  }
}
