import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceStrings {
  public static void main(String[] args) {
      String regex = "\\d{4}-\\d{2}-\\d{2}";  // 日付形式
      String input = "今日の日付は「2024-11-04」の形式";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);
      String result = matcher.replaceAll("yyyy-MM-dd");
      System.out.println(result);
  }
}
