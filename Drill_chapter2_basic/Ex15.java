public class Ex15 {
  public static void main(String[] args) {
    System.out.print("金額 >>");
    int price = new java.util.Scanner(System.in).nextInt();
//    int price = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    System.out.println("10000円札は"+price/10000+"枚");
    price -= price/10000*10000;
    System.out.println("5000円札は"+price/5000+"枚");
    price -= price/5000*5000;
    System.out.println("1000円札は"+price/1000+"枚");
    price -= price/1000*1000;
    System.out.println("500円玉は"+price/500+"枚");
    price -= price/500*500;
    System.out.println("100円玉は"+price/100+"枚");
    price -= price/100*100;
    System.out.println("50円玉は"+price/50+"枚");
    price -= price/50*50;
    System.out.println("10円玉は"+price/10+"枚");
    price -= price/10*10;
    System.out.println("5円玉は"+price/5+"枚");
    price -= price/5*5;
    System.out.println("1円玉は"+price+"枚");
  }
}
