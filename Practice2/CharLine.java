import java.util.Scanner;

public class CharLine {
  public static void main(String[] args) {
    System.out.print("入力：");
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    String str = scan.nextLine();

    String[] nums = str.split(",");
    String result = "";
    for (String num : nums) {
      result += num + " ";
      int cnt = Integer.parseInt(num);
      for (int i=1; i<=cnt; i++) {
        if (i % 5 == 0) {
          result += "* ";
        } else {
          result += "*";
        }
      }
      result += "\n";
    }
    System.out.println(result);
    scan.close();
  }
}
