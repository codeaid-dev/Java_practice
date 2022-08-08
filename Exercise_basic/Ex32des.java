public class Ex32des {
  public static void main(String[] args) {
    // 文字列
    String str = "sample";
    System.out.println(String.format("「%s」", str));
    System.out.printf("「%s」\n",str);
    System.out.println(String.format("「%10s」", str));
    System.out.printf("「%10s」\n",str);
    System.out.println(String.format("「%-10s」", str));
    System.out.printf("「%-10s」\n",str);
    System.out.println(String.format("「%.2s」", str));
    System.out.printf("「%.2s」\n",str);
    System.out.println(String.format("「%.7s」", str));
    System.out.printf("「%.7s」\n",str);
    System.out.println(String.format("「%2$s」「%1$s」", str, "これが先"));
    System.out.printf("「%2$s」「%1$s」\n",str, "これが先");
    // 整数と浮動小数点
    int numd = 128;
    System.out.println(String.format("「%d」", numd));
    System.out.printf("「%d」\n",numd);
    System.out.println(String.format("「%05d」", numd));
    System.out.printf("「%05d」\n",numd);
    System.out.println(String.format("「%x」", numd));
    System.out.printf("「%x」\n",numd);
    double numf = 1.23456;
    System.out.println(String.format("「%f」", numf));
    System.out.printf("「%f」\n",numf);
    System.out.println(String.format("「%.3f」", numf));
    System.out.printf("「%.3f」\n",numf);
    // 日付
    java.util.Date d = new java.util.Date();
    System.out.println(String.format("%tY年%tm月%td日", d,d,d));
    System.out.printf("%tY年%tm月%td日\n",d,d,d);
    System.out.println(String.format("%tH時%tM分%tS秒", d,d,d));
    System.out.printf("%tH時%tM分%tS秒\n",d,d,d);
    System.out.println(String.format("%tT", d));
    System.out.printf("%tT\n",d);
    System.out.println(String.format("%tD", d));
    System.out.printf("%tD\n",d);
    System.out.println(String.format("%tF", d));
    System.out.printf("%tF\n",d);
  }
}
