import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Ex24 {
  public static void main(String[] args) {
    List<Map<String,String>> member = new ArrayList<>();
    Map<String,String> name = new HashMap<>(Map.of("001","Tanaka","mail","foobar@hoge.com"));
    member.add(name);
    member.add(name);
    name = new HashMap<>(Map.of("002","Suzuki"));
    member.add(name);
    name = new HashMap<>(Map.of("003","Yamada"));
    member.add(name);
    System.out.println(member.toString());
    Set<Map<String,String>> result1 = new HashSet<>(member);
    System.out.println(result1.toString());

    List<List<Integer>> nums = new ArrayList<>();
    List<Integer> n1 = new ArrayList<>(List.of(1,2,3));
    List<Integer> n2 = new ArrayList<>(List.of(3,4));
    List<Integer> n3 = new ArrayList<>(List.of(4,5));
    nums.add(n1);
    nums.add(n2);
    nums.add(n1);
    nums.add(n3);
    System.out.println(nums.toString());
    Set<List<Integer>> result2 = new HashSet<>(nums);
    System.out.println(result2.toString());
  }
}
