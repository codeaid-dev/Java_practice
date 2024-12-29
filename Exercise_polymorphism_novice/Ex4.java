interface Movable {
  void move();
}

class Car implements Movable {
  @Override
  public void move() {
    System.out.println("車は動いている");
  }
}

class Bike implements Movable {
  @Override
  public void move() {
    System.out.println("バイクは動いている");
  }
}

public class Ex4 {
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
