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
    List<Integer> arraylist = new ArrayList<>(List.of(1,2,3,4,5));
    System.out.println("arraylist: "+arraylist);
    String[] colors = {"赤","青","黄","緑"};
    List<String> arraylist2 = new ArrayList<>(List.of(colors));
    System.out.println("arraylist2: "+arraylist2);
    Set<String> hashset1 = new HashSet<>(Set.of("Yellow","Orange","Black"));
    System.out.println("hashset1: "+hashset1);
    Integer[] nums = {2,4,3,6,1,5,7};
    Set<Integer> hashset2 = new HashSet<>(Set.of(nums));
    System.out.println("hashset2: "+hashset2);
    //Map.of(key,value…)
    Map<String,Integer> hashmap = new HashMap<>(Map.of("A",1,"B",2,"C",3));
    System.out.println("hashmap: "+hashmap);
  }
}
