import java.util.HashMap;

public class Ex36 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] ss = s.split(",");
    HashMap<Integer,Integer> result = new HashMap<>();
    for (String n : ss) {
      int num = Integer.parseInt(n);
      int value = num*num;
      if (value%3 == 0 || value%5 == 0) {
        result.put(num,value);
      }
    }
    System.out.println(result.toString());
  }
}
