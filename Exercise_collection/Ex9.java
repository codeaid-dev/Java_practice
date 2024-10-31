import java.util.Arrays;
import java.util.HashSet;

public class Ex9 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] ss = s.split("");
    HashSet<String> set = new HashSet<>(Arrays.asList(ss));
//    HashSet<String> set = new HashSet<>(Set.of(ss)); //重複する要素が存在するので使用できない(エラー)
    System.out.println("種類数："+set.size());
  }
}
