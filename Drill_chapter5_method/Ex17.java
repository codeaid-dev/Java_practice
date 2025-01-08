public class Ex17 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    System.out.println("結果：" + joinString(nums, ","));
  }
  public static String joinString(int[] arr, String sep) {
    String result = "";
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
      if (i < arr.length-1) {
        result += sep;
      }
    }
    return result;
  }
}
