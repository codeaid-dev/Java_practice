import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String input = new Scanner(System.in).nextLine();
    String regex = ".*(Java|Python).*";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(input);
    System.out.println(matcher.matches());
  }
}
