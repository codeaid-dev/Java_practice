public class Ex11 {
  public static void main(String[] args) {
    double a = 36.24;
    double b = 36.354;
    String str = "foobar";
    int num = 15;
    System.out.println(String.format("体温は%.1fです", a));
    System.out.printf("体温は%.2fです\n",b);
    System.out.println(String.format("体温は%dです", (int)a));
    System.out.println(String.format("「%.3s」", str));
    System.out.println(String.format("「%05d」", num));
  }
}
