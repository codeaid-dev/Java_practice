import java.util.ArrayList;

public class EachAdd {
  public static void main(String[] args) {
    ArrayList<String> nums = new ArrayList<String>();
    int num = new java.util.Random().nextInt(9)+1;
    System.out.println("選んだ数値："+Integer.toString(num));

    for (int i = 0; i < 10; i++) {
      num += num;
      if (num >= 10) {
        int first = num / 10;
        int second = num % 10;
        num = first + second;
      }
      nums.add(Integer.toString(num));
    }
    String result = String.join(",", nums);
    System.out.println(result);
  }
}
