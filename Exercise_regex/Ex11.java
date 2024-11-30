import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex11 {
  public static void main(String[] args) {
    String regex = "<.+?>";
    String input = "<p>Thank you!</p>";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
        System.out.println("タグ検索: " + matcher.group());
    }
  }
}
