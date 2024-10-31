import java.util.ArrayList;
import java.util.List;

public class Ex39 {
  public static void main(String[] args) {
    Character[][] l1 = {{'a','b'}, {'e','f','g'}, {'j','k'}};
    Character[][] l2 = {{'c','d'}, {'h','i'}, {'l','m','n'}};
    ArrayList<List<Character>> result = new ArrayList<>();
    for (int i=0; i<l1.length; i++) {
      ArrayList<Character> w1 = new ArrayList<>(List.of(l1[i]));
      ArrayList<Character> w2 = new ArrayList<>(List.of(l2[i]));
      w1.addAll(w2);
      result.add(w1);
    }
    System.out.println(result.toString());
  }
}
