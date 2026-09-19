public class Main {
  public static void main(String[] args) {
    Movable[] mv = {new Car(), new Bike()};
    for (Movable m : mv) {
      m.move();
    }
  }
}
