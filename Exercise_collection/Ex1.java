import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
//    List<Integer> nums = new ArrayList<>(Arrays.asList(34,54,67,89,11,43,94));
    List<Integer> nums = new ArrayList<>(List.of(34,54,67,89,11,43,94));
    Integer n = nums.get(4);
    nums.remove(4);
    System.out.println("INDEX4を削除："+nums.toString());
    nums.add(2,n);
    System.out.println("INDEX2を挿入："+nums.toString());
    nums.add(n);
    System.out.println("最後に追加："+nums.toString());
  }
}
