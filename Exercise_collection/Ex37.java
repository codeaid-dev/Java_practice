import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public class Ex37 {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,2,2,4,4,4,5,5,5,5));
    HashSet<Integer> set = new HashSet<>(nums);
    System.out.println(set.toString());
    HashMap<Integer,Integer> result = new HashMap<>();
    for (Integer n : set) {
      int count=0;
      for (Integer i : nums) {
        if (n == i) {
          count++;
        }
      }
      result.put(n,count);
    }
    System.out.println(result.toString());
  }
}
