import java.util.HashMap;

public class Ex14 {
  public static void main(String[] args) {
    HashMap<String,Integer> menu = new HashMap<>();
    menu.put("coffee",250);
    menu.put("tea",230);
    menu.put("milk",150);
    System.out.println(menu.containsValue(230));
  }
}
