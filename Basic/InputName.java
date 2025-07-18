import java.util.Scanner;
public class InputName {
  public static void main(String[] args) {
    String name = new Scanner(System.in).nextLine();
//    String name = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.println("Hello, " + name);
  }
}
