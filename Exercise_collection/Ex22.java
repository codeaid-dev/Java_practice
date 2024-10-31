import java.util.ArrayList;
import java.util.List;

public class Ex22 {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
    ArrayList<Integer> result = new ArrayList<>();
    for (Integer n : nums) {
      if (n%2 == 0) {
        result.add(n);
      }
    }
    System.out.println(result.toString());
  }
}
