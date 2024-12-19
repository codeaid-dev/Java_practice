import java.util.Arrays;
import java.util.Random;

public class Ex69 {
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
    int[] cards = new int[5];
    int index1 = 0;
    while (index1 < 5) {
      int index2 = new Random().nextInt(13);
      int index3 = new Random().nextInt(4);
      if (data[index2][index3] != 0) {
        cards[index1] = data[index2][index3];
        data[index2][index3] = 0;
        index1++;
      }
    }
//    System.out.println(Arrays.deepToString(data));
    System.out.println(Arrays.toString(cards));
  }
}
