import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Ex33 {
  public static void main(String[] args) {
    HashMap<String,Set<String>> computers = new HashMap<>(
      Map.of("PC1",Set.of("Intel","NVIDIA","Crucial"),
            "PC2",Set.of("Intel","RADEON","Corsair"),
            "PC3",Set.of("AMD","RADEON","Micron"),
            "PC4",Set.of("Intel","NVIDIA","Corsair"),
            "PC5",Set.of("AMD","NVIDIA","Sillicon Power")));
    for (String key : computers.keySet()) {
      if (computers.get(key).contains("NVIDIA")) {
        System.out.println(key);
      }
    }
  }
}
