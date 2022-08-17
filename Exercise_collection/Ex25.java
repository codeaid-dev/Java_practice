import java.util.ArrayList;
import java.util.List;

public class Ex25 {
  public static void main(String[] args) {
    String colors = "red,yellow,black,blue,white,green,pink";
    String[] cl = colors.split(",");
    List<String> result = new ArrayList<>();
    for (String c : cl) {
      if (c.length() > 4) {
        result.add(c);
      }
    }
    System.out.println(result.toString());
  }
}
