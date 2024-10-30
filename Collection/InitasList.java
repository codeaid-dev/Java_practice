import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class InitasList {
  public static void main(String[] args) {
    ArrayList<Integer> arraylist1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    System.out.println("arraylist1: "+arraylist1);
    String[] colors = {"赤","青","黄","緑"};
    ArrayList<String> arraylist2 = new ArrayList<>(Arrays.asList(colors));
    System.out.println("arraylist2: "+arraylist2);
    HashSet<String> hashset1 = new HashSet<>(Arrays.asList("Yellow","Orange","Black"));
    System.out.println("hashset1: "+hashset1);
    Integer[] nums = {2,4,3,6,1,3,4,5,2,6,7};
    HashSet<Integer> hashset2 = new HashSet<>(Arrays.asList(nums));
    System.out.println("hashset2: "+hashset2);
  }
}
