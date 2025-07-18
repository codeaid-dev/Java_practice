public class Ex36 {
  public static void main(String[] args) {
    int[] nums = new int[3];
    for (int i = 0; i < nums.length; i++) {
      int n = new java.util.Random().nextInt(9)+1;
      nums[i] = n;
    }
    System.out.print("数字を入力: ");
    int in = new java.util.Scanner(System.in).nextInt();
//    int in = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    boolean find = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == in) {
        find = true;
        break;
      }
    }
    System.out.println(java.util.Arrays.toString(nums));
    if (find) System.out.println("含まれています");
    else System.out.println("含まれていません");
  }
}
