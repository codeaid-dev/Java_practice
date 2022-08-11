public class Ex48 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] nums = s.split(",");
    int max=0;
    for (String num : nums) {
      if (max < Integer.parseInt(num)) {
        max = Integer.parseInt(num);
      }
    }
    System.out.println("最大値は"+max+"です");
  }
}
