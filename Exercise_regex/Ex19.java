import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex19 {
  public static void main(String[] args) {
    String input = """
                id,name,age,department
                1001,山田太郎,32,営業部
                h201,田中二郎,38,人事部
                a305,佐藤三郎,45,経理部
                2001,高橋史朗,28,開発部
                """;
    String regex = "^\\d.*";
    Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    Matcher matcher = pattern.matcher(input);

    while (matcher.find()) {
      System.out.println("行検索: " + matcher.group());
    }
  }
}
