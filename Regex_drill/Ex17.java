import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17 {
  public static void main(String[] args) {
    String regex = "(\\d{3}-\\d{4})|(\\d{4}-\\d{3}-\\d{3})";
    String input = """
            〒550-0014 大阪市西区北堀江2-4-6 tel:0120-121-807
            〒134-0088 東京都江戸川区西葛西5丁目3-1 tel:0120-532-303
            〒604-8165 京都府京都市中京区烏帽子屋町502 tel:0120-109-525
            """;
    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      if (matcher.group(1) != null) {
        System.out.println("郵便番号検索: " + matcher.group(1));
      } else if (matcher.group(2) != null) {
        System.out.println("電話番号検索: " + matcher.group(2));
      }
    }
  }
}
