import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class Ex20 {
  public static void main(String[] args) {
    Map<String,Double> week = new HashMap<>(Map.ofEntries(
      entry("日",0.0),
      entry("月",0.0),
      entry("火",0.0),
      entry("水",0.0),
      entry("木",0.0),
      entry("金",0.0),
      entry("土",0.0)));
    for (String day : week.keySet()) {
      System.out.print(day+"曜日のデータを入力>>");
      double temp = new java.util.Scanner(System.in).nextDouble();
      week.put(day,temp);
    }
    System.out.println(week.toString());
  }
}
