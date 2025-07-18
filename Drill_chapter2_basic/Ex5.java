public class Ex5 {
  public static void main(String[] args) {
    System.out.print("半径入力 >>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("半径"+num+"cmの円の面積は"+num*num*3.14+"平方cmです");
  }
}
