import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    System.out.print("要素の数 >>");
    int len = new Scanner(System.in).nextInt();
    int[] nums = new int[len];
    for (int i=0; i<len; i++) {
      System.out.print("要素の値(整数) >>");
      nums[i] = new Scanner(System.in).nextInt();
    }
    System.out.println(Arrays.toString(nums));
  }
}
