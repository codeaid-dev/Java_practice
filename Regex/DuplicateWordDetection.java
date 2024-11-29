import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordDetection {
  public static void main(String[] args) {
    String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
    String input = "This is is a test Test.";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      System.out.println("重複している単語: " + matcher.group(1));
    }
  }
}
