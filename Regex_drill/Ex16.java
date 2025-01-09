import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex16 {
  public static void main(String[] args) {
    String regex = "\\d{3}-\\d{4}";
    String input = """
            〒550-0014 大阪市西区北堀江2-4-6 tel:0120-121-807
            〒134-0088 東京都江戸川区西葛西5丁目3-1 tel:0120-532-303
            〒604-8165 京都府京都市中京区烏帽子屋町502 tel:0120-109-525
            """;
    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
        System.out.println("郵便番号検索: " + matcher.group());
    }
  }
}
