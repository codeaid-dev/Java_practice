import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex8 {
  public static void main(String[] args) {
    String[] A = {"秋田県","山形県","山口県","宮崎県","高知県"};
    String[] B = {"山口県","高知県","長崎県","北海道","石川県"};
//    Set<String> setA = new HashSet<>(Arrays.asList(A));
    Set<String> setA = new HashSet<>(Set.of(A));
//    Set<String> setB = new HashSet<>(Arrays.asList(B));
    Set<String> setB = new HashSet<>(Set.of(B));
    setA.retainAll(setB);
    System.out.println(setA.toString());
//    setA = new HashSet<>(Arrays.asList(A));
    setA = new HashSet<>(Set.of(A));
    setA.removeAll(setB);
//    Set<String> setC = new HashSet<>(Arrays.asList(A));
    Set<String> setC = new HashSet<>(Set.of(A));
    setB.removeAll(setC);
    setA.addAll(setB);
    System.out.println(setA.toString());

  }
}
