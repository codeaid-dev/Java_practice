public class Ex12 {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40};
    System.out.println("結果：" + contains(nums, 30));
    System.out.println("結果：" + contains(nums, 50));
  }
  public static boolean contains(int[] array, int value) {
    for (int num : array) {
      if (num == value) {
        return true;
      }
    }
    return false;
  }
}
