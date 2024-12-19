import java.util.Arrays;

public class Ex14 {
  public static void main(String[] args) {
    int[][] data1 = {{1, 2}, {3, 4}, {5, 6}};
    int[][] data2 = new int[data1[0].length][data1.length];
    for (int i = 0; i < data1.length; i++) {
      for (int j = 0; j < data1[i].length; j++) {
        data2[j][i] = data1[i][j];
      }
    }
    System.out.println(Arrays.deepToString(data2));
  }
}
