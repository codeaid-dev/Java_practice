import java.util.List;
import java.util.ArrayList;

public class Main {

  public Main() {
    array();
  } 
  public static void main(String[] args) {
    new Main();
  }

  public void standard() {
    int[] nums = {61, 54, 65, 80, 59};
    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
  }

  public void array() {
    List<Integer> nums = new ArrayList<Integer>();

    nums.add(61);
    nums.add(54);
    nums.add(65);
    nums.add(80);
    nums.add(59);
    for (Integer num : nums) {
      System.out.println("nums[" + nums.indexOf(num) + "] = " + num);
    }

    nums.set(1, 70);
    System.out.println("変更：" + nums);
//    for (Integer num : nums) {
//      System.out.println("nums[" + nums.indexOf(num) + "] = " + num);
//    }

    nums.remove(2);
    System.out.println("削除：" + nums);
//    for (Integer num : nums) {
//      System.out.println("nums[" + nums.indexOf(num) + "] = " + num);
//    }
  }
}