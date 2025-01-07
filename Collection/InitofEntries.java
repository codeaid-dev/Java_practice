import static java.util.Map.entry;
import java.util.HashMap;
import java.util.Map;

public class InitofEntries {
  public static void main(String[] args) {
    Map<Integer,String> hashmap = new HashMap<>(Map.ofEntries(
      entry(1, "a"),
      entry(2, "b"),
      entry(3, "c")));
    System.out.println("hashmap: "+hashmap);
  }
}
