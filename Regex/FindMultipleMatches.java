import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindMultipleMatches {
  public static void main(String[] args) {
      String regex = "\\b\\w{4}\\b";  // 4文字の英単語
      String input = "This is a test with four word matches.";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);

      while (matcher.find()) {
          System.out.println("Matched: " + matcher.group());
      }
  }
}