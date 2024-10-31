import java.util.HashMap;

public class Ex5 {
  public static void main(String[] args) {
    int[] id = {26,41,28};
    HashMap<String, HashMap<String, Integer>> member = new HashMap<>();
    for (int i=0; i<id.length; i++) {
      HashMap<String, Integer> w = new HashMap<>();
      w.put("ID",id[i]);
      if (id[i] == 26)
        member.put("Takashi", w);
      else if (id[i] == 41)
        member.put("Tetsuo", w);
      else
        member.put("Akira", w);
    }
    System.out.println(member.toString());
  }
}
