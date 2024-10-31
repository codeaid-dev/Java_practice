import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex6 {
  public static void main(String[] args) {
    Character[] c1 = {'g', 'a', 'c', 'e', 'j'};
    Character[] c2 = {'a', 'e', 'z', 'x', 'g'};
//    HashSet<Character> set1 = new HashSet<>(Arrays.asList(c1));
    HashSet<Character> set1 = new HashSet<>(Set.of(c1));
//    HashSet<Character> set2 = new HashSet<>(Arrays.asList(c2));
    HashSet<Character> set2 = new HashSet<>(Set.of(c2));
    set1.addAll(set2);
    System.out.println(set1.toString());
//    set1 = new HashSet<>(Arrays.asList(c1));
    set1 = new HashSet<>(Set.of(c1));
    set1.retainAll(set2);
    System.out.println(set1.toString());
//    set1 = new HashSet<>(Arrays.asList(c1));
    set1 = new HashSet<>(Set.of(c1));
    set1.removeAll(set2);
    System.out.println(set1.toString());
//    set1 = new HashSet<>(Arrays.asList(c1));
    set1 = new HashSet<>(Set.of(c1));
//    HashSet<Character> set3 = new HashSet<>(Arrays.asList(c1));
    HashSet<Character> set3 = new HashSet<>(Set.of(c1));
    set1.removeAll(set2);
    set2.removeAll(set3);
    set1.addAll(set2);
    System.out.println(set1.toString());
  }
}
