import java.util.Arrays;
import java.util.Random;

public class Ex30 {
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
    int[] counts = new int[14]; // インデックス0は未使用
    // 出現回数をカウント
    //int[] nums = {2,3,3,3,2}; // for test
    for (int num : cards) {
      counts[num]++;
    }
    int four = 0;
    int three = 0;
    int pair = 0;
    for (int count : counts) {
      if (count == 4) {
        four++;
      } else if (count == 3) {
        three++;
      } else if (count == 2) {
        pair++;
      }
    }

    // 役の判定
    if (four == 1) {
        System.out.println("フォーカード");
    } else if (three == 1 && pair == 1) {
        System.out.println("フルハウス");
    } else if (three == 1) {
        System.out.println("スリーカード");
    } else if (pair == 2) {
        System.out.println("ツーペア");
    } else if (pair == 1) {
        System.out.println("ワンペア");
    } else {
        System.out.println("ノーハンド");
    }
  }
}
