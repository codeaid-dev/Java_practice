import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindHiragana {
  public static void main(String[] args) {
    String regex = "(?=.*[\u3041-\u3096])[\u3041-\u3096]{1,}";
    String input = "hogeあfoobarいhogehogeうfooえおbar";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
        System.out.println("ひらがな検索: " + matcher.group());
    }
  }
}
