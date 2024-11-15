public class Car extends Vehicle {
  private int speed;
  private double fuel;
  public Car() {
    super("自動車");
    this.speed = 0;
    this.fuel = 0.0;
  }
  public static String getType() {
    return "自動車";
  }
  public void refuel(double amount) {
    this.fuel += amount;
    if (this.fuel > 50) {
      this.fuel = 50; 
    }
  }
  public void accelerate() {
    if (this.fuel > 0) {
      this.speed += 10;
      this.fuel -= 2.6;
    } else {
      this.speed = 0;
    }
  }
  public void accelerate(int increase) {
    if (this.fuel > 0) {
      this.speed += increase;
      this.fuel -= increase*0.26;
    } else {
      this.speed = 0;
    }
  }
  public void stop() {
    this.speed = 0;
  }
  public void showStatus() {
    if (this.speed > 0) {
      System.out.println("走行中："+"速度="+this.speed+"燃料="+this.fuel);
    } else {
      System.out.println("停止中");
    }
  }
}
