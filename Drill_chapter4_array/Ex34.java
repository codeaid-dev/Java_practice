import java.util.Arrays;
import java.util.Random;

public class Ex34 {
  public static void main(String[] args) {
    int[] data = new int[8];
    for (int i = 0; i < data.length; i++) {
      data[i] = new Random().nextInt(6)+1;
    }
    String result = "";
    for (int n1 : data) {
      int count = 0;
      for (int n2 : data) {
        if (n1 == n2) {
          count++;
          if (count > 1 && result.indexOf("(" + n1 + ")") == -1) {
            result += "(" + n1 + ")";
          }
        }
      }
    }
    System.out.println(Arrays.toString(data));
    System.out.println(result);
  }
}
