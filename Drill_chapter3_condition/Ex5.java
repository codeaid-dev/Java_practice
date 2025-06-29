import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    String frt1 = "Apple", frt2 = "Banana";
    String veg1 = "Carrot", veg2 = "Onion";
    System.out.print("どれですか？ >>");
    String str = new Scanner(System.in).nextLine();
//    String str = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (str.equals(frt1) || str.equals(frt2)) {
      System.out.println("フルーツです");
    } else if (str.equals(veg1) || str.equals(veg2)) {
      System.out.println("野菜です");
    } else {
      System.out.println("それはありません");
    }
  }
}
