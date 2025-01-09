import java.util.ArrayList;
import java.util.List;

public class Ex3 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    List<List<Integer>> result = new ArrayList<>();
    for (int n : nums) {
      List<Integer> w = new ArrayList<>();
      w.add(n);
      w.add(n*n);
      result.add(w);
    }
    System.out.println(result.toString());
  }
}
