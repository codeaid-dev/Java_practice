import java.util.Arrays;
import java.util.Random;

public class Ex32 {
  public static void main(String[] args) {
    int[] data1 = {1, 2, 3, 4, 5, 6};
    int[] data2 = new int[data1.length];
    for (int num : data1) {
      while (true) {
        int n = new Random().nextInt(data1.length);
        if (data2[n] == 0) {
          data2[n] = num;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(data2));
  }
}
