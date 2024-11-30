import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex12 {
  public static void main(String[] args) {
    String regex = "<.+?>";
    String input = "<p>Thank you!</p>\n<b>Taro</b>\n<div>Bye bye.</div>";
    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
        System.out.println("タグ検索: " + matcher.group());
    }
  }
}
