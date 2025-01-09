import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Ex17 {
  public static void main(String[] args) {
    Map<List<Integer>,String> colors = new HashMap<>();
    List<Integer> rgb = new ArrayList<>(Arrays.asList(255,0,0));
    colors.put(rgb,"red");
//    rgb = new ArrayList<>(Arrays.asList(0,128,0));
    rgb = new ArrayList<>(List.of(0,128,0));
    colors.put(rgb,"green");
//    rgb = new ArrayList<>(Arrays.asList(0,128,0));
    rgb = new ArrayList<>(List.of(0,128,0));
    colors.put(rgb,"green");
//    rgb = new ArrayList<>(Arrays.asList(0,0,255));
    rgb = new ArrayList<>(List.of(0,0,255));
    colors.put(rgb,"blue");
//    rgb = new ArrayList<>(Arrays.asList(255,255,0));
    rgb = new ArrayList<>(List.of(255,255,0));
    colors.put(rgb,"yellow");
    System.out.println(colors.toString());
    System.out.println(colors.get(new ArrayList<>(List.of(0,128,0))));
    System.out.println(colors.get(new ArrayList<>(List.of(255,255,0))));
  }
}
