import java.util.Scanner;

public class Ex30 {
  public static void main(String[] args) {
    System.out.print(">> ");
    String str = new Scanner(System.in).nextLine();
//    String str = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        if ((y % 2 == 0 && x % 2 == 1) || (y % 2 == 1 && x % 2 == 0)) {
          System.out.print(str);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    System.out.println("");
  }
}
