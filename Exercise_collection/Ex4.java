import java.util.ArrayList;
import java.util.HashMap;

public class Ex4 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    ArrayList<HashMap<Integer,Integer>> result = new ArrayList<>();
    for (int n : nums) {
      HashMap<Integer,Integer> w = new HashMap<>();
      w.put(n,n*n);
      result.add(w);
    }
    System.out.println(result.toString());
  }
}
