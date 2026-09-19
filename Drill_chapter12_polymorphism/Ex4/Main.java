public class Main {
  public static void main(String[] args) {
    Movable[] mv = {new Car(), new Bike(), new Car(), new Bike(), new Bike()};
    for (Movable m : mv) {
      if (m instanceof Car) {
        System.out.println("これはCar");
      } else if (m instanceof Bike) {
        System.out.println("これはBike");
      }
    }
  }
}
