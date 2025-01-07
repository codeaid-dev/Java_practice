import java.util.HashMap;
import java.util.Map;

public class Ex11 {
  public static void main(String[] args) {
    String[] days = {"mon","tue","wed","thu","fri"};
    Double[] temp = {36.2,36.5,36.1,36.8,36.3};
    Map<String, Double> map = new HashMap<>();
    for (int i=0; i<days.length; i++) {
      map.put(days[i], temp[i]);
    }
    System.out.println(map.toString());
  }
}
