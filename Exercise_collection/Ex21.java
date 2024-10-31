import java.util.ArrayList;
import java.util.List;

public class Ex21 {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(List.of(1,2));
    int total = 0;
    total = nums.get(0)+nums.get(1);
    while (total <= 50) {
      nums.add(total);
      total += nums.get(nums.size()-1);
    }
    System.out.println(nums.toString());
  }
}
