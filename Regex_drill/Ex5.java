import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    System.out.print("郵便番号を入力>>");
    String zipcode = new Scanner(System.in).nextLine();
//    String zipcode = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (zipcode.matches("\\d{3}-\\d{4}")) {
//    if (zipcode.matches("[0-9]{3}-[0-9]{4}")) {
      System.out.println("これは郵便番号です");
    } else {
      System.out.println("これは郵便番号ではないです");
    }
  }
}
