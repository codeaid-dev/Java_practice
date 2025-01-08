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

public class Ex3 {
  public static void main(String[] args) {
    Movable[] mv = {new Car(), new Bike()};
    for (Movable m : mv) {
      m.move();
    }
  }
}