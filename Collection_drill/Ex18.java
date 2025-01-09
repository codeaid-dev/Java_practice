import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Ex18 {
  public static void main(String[] args) {
    Map<String,List<Map<String,String>>> member = new HashMap<>();
    List<Map<String,String>> team = new ArrayList<>();
    Map<String,String> info = new HashMap<>();
    info.put("id","21001");
    info.put("name","鶴");
    info.put("temp","36.2,36.3,36.2,36.4,36.7");
    team.add(info);
    info = new HashMap<>();
    info.put("id","21002");
    info.put("name","亀");
    info.put("temp","35.8,36.4,35.9,36.0,36.2");
    team.add(info);
    member.put("A_class",team);

    team = new ArrayList<>();
    info = new HashMap<>();
    info.put("id","21101");
    info.put("name","松");
    info.put("temp","36.0,36.1,36.4,36.3,36.6");
    team.add(info);
    info = new HashMap<>();
    info.put("id","21102");
    info.put("name","竹");
    info.put("temp","36.2,36.3,36.8,36.5,36.3");
    team.add(info);
    member.put("B_class",team);

    System.out.println(member);

    String s = member.get("A_class").get(1).get("temp");
    String[] temps = s.split(",");
    System.out.println(temps[1]);
    s = member.get("B_class").get(1).get("temp");
    temps = s.split(",");
    temps[2] = "36.0";
    s = String.join(",", temps);
    member.get("B_class").get(1).put("temp",s);
    System.out.println(java.util.Arrays.toString(temps));
  }
}
