public class Practice11 {
  public static void main(String[] args) {
    System.out.print("要素の数 >>");
    int len = new java.util.Scanner(System.in).nextInt();
//    int len = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    int[] nums = new int[len];
    for (int i=0; i<len; i++) {
      System.out.print("要素の値 >>");
      nums[i] = new java.util.Scanner(System.in).nextInt();
//      nums[i] = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    }
    for (int i=len-1; i>=0; i--) {
      System.out.print(nums[i]+" ");
    }
    System.out.println("");
  }
}
