import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> items = new ArrayList<String>();
    items.add("独楽");
    items.add("お手玉");
    items.add("竹とんぼ");

    for (int i = 0; i < items.size(); i++) {
      System.out.println(items.get(i));
    }

    for (String item : items) {
      System.out.println(item);
    }

    items.forEach((item) -> {System.out.println(item);});
  }
}