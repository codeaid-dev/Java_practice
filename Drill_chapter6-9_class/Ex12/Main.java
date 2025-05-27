import utilities.Dice;

public class Main {
  public static void main(String[] args) {
    Dice dice = new Dice(1,10);
    int r = dice.roll();
    if (r == 1) {
      System.out.println("結果：大吉");
    } else if (r >= 2 && r <= 4) {
      System.out.println("結果：中吉");
    } else if (r >= 5 && r <= 8) {
      System.out.println("結果：吉");
    } else {
      System.out.println("結果：凶");
    }
  }
}
