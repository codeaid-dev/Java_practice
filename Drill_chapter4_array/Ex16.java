import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    String[] eto = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥" };
    System.out.print("西暦>>");
    int year = new Scanner(System.in).nextInt();
    System.out.println("西暦"+year+"年は、"+eto[(year+8)%eto.length]+"年です");
  }
}
