import java.util.Arrays;

public class Ex70 {
  public static void main(String[] args) {
    int[][] data = new int[13][4];
    int number = 1;
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[0].length; j++) {
        data[i][j] = number;
      }
      number++;
    }
    System.out.println(Arrays.deepToString(data));
  }
}
