import java.util.*;

public class HitAndBlow2 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    Random random = new Random();

    // ランダムな3つの数字（重複なし）
    while (numbers.size() < 3) {
      int num = random.nextInt(9) + 1;
      if (!numbers.contains(num)) numbers.add(num);
    }
    System.out.println(numbers); // デバッグ用

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print(">> ");
      String[] str = sc.nextLine().split(",");
      if (str.length != 3) {
        System.out.println("3つの数字をカンマ区切りで入力してください。");
        continue;
      }

      int one = Integer.parseInt(str[0]);
      int two = Integer.parseInt(str[1]);
      int three = Integer.parseInt(str[2]);

      if (one == two || one == three || two == three) {
        System.out.println("全て異なる数字を入力してください。");
        continue;
      }

      List<Integer> check = new ArrayList<>(List.of(one, two, three));

      int correct = 0;
      int partial = 0;

      // 完全一致
      for (int i = 0; i < 3; i++) {
        int n = numbers.get(i);
        int c = check.get(i);
        if (n == c) {
          correct++;
        }
      }

      // 部分一致
      for (int i = 0; i < 3; i++) {
        int n = numbers.get(i);
        int c = check.get(i);
        if ((n != c) && check.contains(n)) {
          partial++;
        }
      }

      if (correct == 3) {
        System.out.println("🎉 正解！ゲームクリア！");
        System.out.println("答え: " + numbers);
        break;
      } else {
        System.out.println("✅ 完全一致: " + correct + " 個, 🔄 部分一致: " + partial + " 個");
      }
    }
    sc.close();
  }
}
