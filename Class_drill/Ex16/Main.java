public class Main {
  public static void main(String[] args) {
    System.out.println(Car.getType());
    Car car = new Car();
    car.refuel(50);
    car.accelerate(30);
    car.showStatus();
    car.stop();
    car.showStatus();
  }
}
