import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String input = new Scanner(System.in).nextLine();
//    String input = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String regex = ".*\\d.*";
//    String regex = "(?=.*[\\d]).*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    System.out.println(matcher.matches());
  }
}
