public class Car {
  double fuel;
  final int WHEEL = 4;
  public void run(int km) {
    double eco = 50 / this.WHEEL;
    this.fuel -= km / eco;
    System.out.println("燃料：" + Math.round(fuel) + "L");
  }
}
