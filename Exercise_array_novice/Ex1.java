public class Ex1 {
  public static void main(String[] args) {
    int[] nums = {1,4,3,5,6,2,7,8,3,4,6,8,9,1,2};
    int count = 0;
    for (int num : nums) {
      if (num >= 3 && num <= 6) {
        count += 1;
      }
    }
    System.out.println("3~6の数は"+count+"個");
  }
}
