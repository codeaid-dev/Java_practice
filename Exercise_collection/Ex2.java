import java.util.HashMap;
import java.util.Map;

public class Ex2 {
  public static void main(String[] args) {
    String[] red = {"red","#FF0000"};
    String[] green = {"green","#00FF00"};
    String[] blue = {"blue","#0000FF"};
    String[][] rgb = {red,green,blue};
    HashMap<String, String> color = new HashMap<>();
    for (String[] iro : rgb) {
      color.put(iro[0], iro[1]);
    }
    System.out.println(color.toString());
  }
}
