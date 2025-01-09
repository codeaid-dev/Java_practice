import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Ex4 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    List<Map<Integer,Integer>> result = new ArrayList<>();
    for (int n : nums) {
      Map<Integer,Integer> w = new HashMap<>();
      w.put(n,n*n);
      result.add(w);
    }
    System.out.println(result.toString());
  }
}
