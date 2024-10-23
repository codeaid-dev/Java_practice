import java.util.Date;
public class StrFormat {
  public static void main(String[] args) {
    String str = "samle";
    double d = 3.14159265359;
    Date c = new Date();
    System.out.println(String.format("「%3s」", str));
    System.out.println(String.format("「%10s」", str));
    System.out.println(String.format("「%-10s」", str));
    System.out.println(String.format("「%.2s」", str));
    System.out.println(String.format("「%f」", d));
    System.out.println(String.format("「%.2f」", d));
    System.out.println(String.format("%tY年 %tm月 %td日", c,c,c));
    System.out.println(String.format("%1$tH時 %1$tM分 %1$tS秒", c));
    System.out.printf("%1$tH時 %1$tM分 %1$tS秒\n", c);
  }
}
