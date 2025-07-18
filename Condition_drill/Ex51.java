public class Ex51 {
  public static void main(String[] args) {
    int[] nums = new int[5];
    for (int i=0; i<nums.length; i++) {
      nums[i] = new java.util.Random().nextInt(15)+1;
    }
    System.out.print("入力>>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    boolean exist=false;
    for (int n : nums) {
      if (n == num) {
        exist = true;
        break;
      }
    }
    System.out.println(java.util.Arrays.toString(nums));
    if (exist) {
      System.out.println("あります");
    } else {
      System.out.println("ありません");
    }
  }
}
