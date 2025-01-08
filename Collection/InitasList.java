import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InitasList {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A","B","C");
    System.out.println("list: "+list);
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    System.out.println("list1: "+list1);
    String[] colors = {"赤","青","黄","緑"};
    List<String> list2 = new ArrayList<>(Arrays.asList(colors));
    System.out.println("list2: "+list2);
    Set<String> set1 = new HashSet<>(Arrays.asList("Yellow","Orange","Black"));
    System.out.println("set1: "+set1);
    Integer[] nums = {2,4,3,6,1,3,4,5,2,6,7};
    Set<Integer> set2 = new HashSet<>(Arrays.asList(nums));
    System.out.println("set2: "+set2);
  }
}
