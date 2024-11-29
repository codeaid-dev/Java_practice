import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLExtraction {
  public static void main(String[] args) {
    String regex = "https?://[a-zA-Z0-9.\\-]+";
    String input = "このサイトhttps://hoge-sample.comとこのサイトhttp://test.comを参照する";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      System.out.println("URL: " + matcher.group());
    }
  }
}
