import java.util.HashMap;
import java.util.List;

public class Ex29 {
  public static void main(String[] args) {
    String[][] info = {{"red","#FF0000","20"},{"yellow","#FFFF00","80"},{"blue","#0000FF","50"}};
    HashMap<String,List<String>> result = new HashMap<>();
    for (String[] color : info) {
      List<String> w = List.of(color[1],color[2]);
      result.put(color[0],w);
    }
    System.out.println(result.toString());
  }
}
