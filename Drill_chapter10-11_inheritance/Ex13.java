interface Flyable {
  void fly();
}

interface Swimmable {
  void swim();
}

class Duck implements Flyable, Swimmable {
  @Override
  public void fly() {
    System.out.println("アヒルは飛んでいる");
  }

  @Override
  public void swim() {
    System.out.println("アヒルは泳いでいる");
  }
}

public class Ex13 {
  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.fly();
    duck.swim();
  }
}
