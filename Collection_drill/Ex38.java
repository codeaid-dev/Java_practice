import java.util.ArrayList;
import java.util.List;

public class Ex38 {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>(List.of("red","green","blue","white","black","orange"));
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    colors.remove(s);
    System.out.println(colors.toString());
  }
}
