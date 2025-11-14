import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Ex37 {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(List.of(1,2,2,2,4,4,4,5,5,5,5));
    Set<Integer> set = new HashSet<>(nums);
    System.out.println(set.toString());
    Map<Integer,Integer> result = new HashMap<>();
    for (Integer n : set) {
      int count=0;
      for (Integer i : nums) {
        if (n.equals(i)) {
          count++;
        }
      }
      result.put(n,count);
    }
    System.out.println(result.toString());
  }
}
