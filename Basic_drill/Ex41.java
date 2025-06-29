public class Ex41 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    int n1 = new java.util.Scanner(System.in).nextInt();
//    int n1 = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    int n2 = n1/3;
    int n3 = ((n1%3)/2)+n2;
    int n4 = ((n1%3)/2)+((n1%3)%2)+n2;
    System.out.println(n2+"+"+n3+"+"+n4+"="+(n2+n3+n4));
  }
}
