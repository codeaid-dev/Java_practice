import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Ex23 {
  public static void main(String[] args) {
    Map<String,String> map = new HashMap<>(Map.of("name","Tanaka","age","25","salary","150000","city","Tokyo"));
    List<String> keys = new ArrayList<>(List.of("name","salary"));
    Map<String,String> result = new HashMap<>();
    for (String key : keys) {
      result.put(key,map.get(key));
    }
    System.out.println(result.toString());
  }
}
