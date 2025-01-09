public class Ex54 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] nums = s.split(",");
    for (String num : nums) {
      int n = Integer.parseInt(num);
      for (int i=0; i<n; i++) {
        System.out.print("@");
      }
      System.out.print("\n");
    }    
  }
}
