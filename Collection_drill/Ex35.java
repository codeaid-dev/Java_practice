import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Ex35 {
  public static void main(String[] args) {
    Map<String,Set<String>> computers = new HashMap<>(
      Map.of("PC1",Set.of("Intel","NVIDIA","Crucial"),
            "PC2",Set.of("Intel","RADEON","Corsair"),
            "PC3",Set.of("AMD","RADEON","Micron"),
            "PC4",Set.of("Intel","NVIDIA","Corsair"),
            "PC5",Set.of("AMD","NVIDIA","Sillicon Power")));
    for (String key : computers.keySet()) {
      if (computers.get(key).contains("AMD") || computers.get(key).contains("Crucial")) {
        System.out.println(key);
      }
    }
  }
}
