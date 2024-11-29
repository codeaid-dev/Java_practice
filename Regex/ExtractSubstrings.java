import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractSubstrings {
  public static void main(String[] args) {
    String regex = "(\\d{4})-(\\d{2})-(\\d{2})";  // 日付形式
    String input = "今日は2024-11-04.";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) {
      System.out.println("年: " + matcher.group(1));
      System.out.println("月: " + matcher.group(2));
      System.out.println("日: " + matcher.group(3));
    }
  }
}
