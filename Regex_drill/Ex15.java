import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String input = new Scanner(System.in).nextLine();
    String regex = "\\d{1,3}(\\.\\d{1,3}){3}";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    System.out.println(matcher.matches());
  }
}
