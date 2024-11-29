import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineStartsWith {
  public static void main(String[] args) {
    String regex = "^Error:.*";
    String input = "Info: System started.\nError: Null pointer exception.\nInfo: Process completed.";
    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      System.out.println("エラー行: " + matcher.group());
    }
  }
}
