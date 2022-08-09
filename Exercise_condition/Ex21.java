public class Ex21 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] nums = s.split(",");
    int n1 = Integer.parseInt(nums[0]);
    int n2 = Integer.parseInt(nums[1]);
    int cnt=0;
    for (int i=n1; i<=n2; i++) {
      if ((n1+n2+i)%3==0) {
        cnt++;
      }
    }
    System.out.println("整数の平均値は"+cnt+"個");
  }
}
