import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex20 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String input = new Scanner(System.in).nextLine();
//    String input = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String regex = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    System.out.println(matcher.matches());
  }
}
