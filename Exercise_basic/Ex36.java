public class Ex36 {
  public static void main(String[] args) {
    System.out.print("予算 >>");
    int N = new java.util.Scanner(System.in).nextInt();
    System.out.print("人数 >>");
    int M = new java.util.Scanner(System.in).nextInt();
    System.out.println("お年玉は"+(N / (M*1000)) * 1000+"円");
  }
}
