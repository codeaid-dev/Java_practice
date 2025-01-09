public class Ex4 {
  public static void main(String[] args) {
    String frt1="Apple",frt2="Banana";
    String veg1="Carrot",veg2="Onion";
    System.out.print("どれですか？>>");
    String s = new java.util.Scanner(System.in).nextLine();
    if (s.equals(frt1) || s.equals(frt2)) {
      System.out.println("フルーツです");
    } else if (s.equals(veg1) || s.equals(veg2)) {
      System.out.println("野菜です");
    } else {
      System.out.println("それはありません");
    }
  }
}
