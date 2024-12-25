package utilities;

public class Dice {
  int min;
  int max;
  public Dice(int min, int max) {
    this.min = min;
    this.max = max;
  }
  public int roll() {
    return new java.util.Random().nextInt(this.max-(this.min-1))+this.min;
  }
}
