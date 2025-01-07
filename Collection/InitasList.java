import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InitasList {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A","B","C");
    System.out.println("list: "+list);
    List<Integer> arraylist1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    System.out.println("arraylist1: "+arraylist1);
    String[] colors = {"赤","青","黄","緑"};
    List<String> arraylist2 = new ArrayList<>(Arrays.asList(colors));
    System.out.println("arraylist2: "+arraylist2);
    Set<String> hashset1 = new HashSet<>(Arrays.asList("Yellow","Orange","Black"));
    System.out.println("hashset1: "+hashset1);
    Integer[] nums = {2,4,3,6,1,3,4,5,2,6,7};
    Set<Integer> hashset2 = new HashSet<>(Arrays.asList(nums));
    System.out.println("hashset2: "+hashset2);
  }
}
