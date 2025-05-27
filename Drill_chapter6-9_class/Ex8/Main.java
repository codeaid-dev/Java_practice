public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.fuel = 50;
    car.run(100);
    for (int i = 1; i < 5; i++) {
      car.run(i * 10);
    }
  }
}
