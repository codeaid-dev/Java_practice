class Vehicle {
  int speed;
  void showSpeed() {
    System.out.println("速度：" + speed + " km/h");
  }
}

class Car extends Vehicle {
  void setSpeed(int speed) {
    this.speed = speed;
  }
}

public class Ex2 {
  public static void main(String[] args) {
    Car car = new Car();
    car.setSpeed(120);
    car.showSpeed();
  }
}
