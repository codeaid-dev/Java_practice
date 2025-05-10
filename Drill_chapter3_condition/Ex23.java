public class Ex23 {
  public static void main(String[] args) {
    System.out.print("行数>>");
    int n = new java.util.Scanner(System.in).nextInt();
    for (int i=1; i<=n; i++) {
        String result = "";
        for (int col=1; col<=i; col++) {
            result += col;
        }
        System.out.println(result);
    }
  }
}
