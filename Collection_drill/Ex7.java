import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex7 {
  public static void main(String[] args) {
    Integer[] l1 = {1,3,5,7,9};
    Integer[] l2 = {1,2,4,6,7,8};
//    Set<Integer> s1 = new HashSet<>(Arrays.asList(l1));
    Set<Integer> s1 = new HashSet<>(Set.of(l1));
//    Set<Integer> s2 = new HashSet<>(Arrays.asList(l2));
    Set<Integer> s2 = new HashSet<>(Set.of(l2));
//    Set<Integer> s3 = new HashSet<>(Arrays.asList(l1));
    Set<Integer> s3 = new HashSet<>(Set.of(l1));
    s1.removeAll(s2);
    s2.removeAll(s3);
    s1.addAll(s2);
    System.out.println(s1.toString());
  }
}
