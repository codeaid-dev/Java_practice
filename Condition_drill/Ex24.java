public class Ex24 {
  public static void main(String[] args) {
    int[] nums = {1,5,20,30,4,9,18};
    int total=0;
    for (int num : nums) {
      if (num > 5) {
        total += num;
      }
    }
    System.out.println(total);
  }
}
