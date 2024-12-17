import java.util.Arrays;

public class Ex6 {
  public static void main(String[] args) {
    String[] team_1 = {"阪神","巨人","ヤクルト"};
    String[] team_2 = {"DeNA","中日","広島"};
    String[] central = new String[team_1.length + team_2.length];
    for (int i = 0; i < central.length; i++) {
      if (i < 3) {
        central[i] = team_1[i];
      } else {
        central[i] = team_2[i - 3];
      }
    }
    System.out.println(Arrays.toString(central));
  }
}
