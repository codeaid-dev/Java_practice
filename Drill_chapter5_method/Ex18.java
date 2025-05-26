public class Ex18 {
  public static void main(String[] args) {
    System.out.print("割り算を入力: ");
    String str = new java.util.Scanner(System.in).nextLine();
    String[] nums = str.split("/");
    divide(Double.parseDouble(nums[0].trim()), Double.parseDouble(nums[1].trim()));
  }
  public static void divide(double n1, double n2) {
    if (n2 == 0) {
      System.out.println("0では割れません");
    } else {
      System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
    }
  }
}
