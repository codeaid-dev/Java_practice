public class Ex23 {
  public static void main(String[] args) {
    int turi = 1000-308;
    System.out.println("500円玉は"+turi/500+"枚");
    turi -= turi/500*500;
    System.out.println("100円玉は"+turi/100+"枚");
    turi -= turi/100*100;
    System.out.println("50円玉は"+turi/50+"枚");
    turi -= turi/50*50;
    System.out.println("10円玉は"+turi/10+"枚");
    turi -= turi/10*10;
    System.out.println("5円玉は"+turi/5+"枚");
    turi -= turi/5*5;
    System.out.println("1円玉は"+turi+"枚");
  }
}
