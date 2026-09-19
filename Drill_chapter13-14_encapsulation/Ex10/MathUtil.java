public class MathUtil {
  public static int max(int a, int b) {
    return (a > b) ? a : b;
  }

  public static int max(int[] nums) {
    int result = nums[0];
    for (int n : nums) {
      if (result < n) { result = n; }
    }
    return result;
  }

  public static int min(int a, int b) {
    return (a < b) ? a : b;
  }

  public static int min(int[] nums) {
    int result = nums[0];
    for (int n : nums) {
      if (result > n) { result = n; }
    }
    return result;
  }

  public static int abs(int x) {
    return (x >= 0) ? x : -x;
  }
}
