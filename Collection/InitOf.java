import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InitOf {
  public static void main(String[] args) {
    List<String> list = List.of("A","B","C");
    System.out.println("list: "+list);
    List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
    System.out.println("list1: "+list1);
    String[] colors = {"赤","青","黄","緑"};
    List<String> list2 = new ArrayList<>(List.of(colors));
    System.out.println("list2: "+list2);
    Set<String> set1 = new HashSet<>(Set.of("Yellow","Orange","Black"));
    System.out.println("set1: "+set1);
    Integer[] nums = {2,4,3,6,1,5,7};
    Set<Integer> set2 = new HashSet<>(Set.of(nums));
    System.out.println("set2: "+set2);
    //Map.of(key,value…)
    Map<String,Integer> map = new HashMap<>(Map.of("A",1,"B",2,"C",3));
    System.out.println("map: "+map);
  }
}
