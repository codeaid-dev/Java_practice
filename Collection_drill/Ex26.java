import java.util.HashMap;
import java.util.Map;

public class Ex26 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    int N = new java.util.Scanner(System.in).nextInt();
//    int N = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    Map<Integer,Integer> result = new HashMap<>();
    for (int i=1; i<=N; i++) {
      result.put(i, i*i);
    }
    System.out.println(result.toString());
  }
}
