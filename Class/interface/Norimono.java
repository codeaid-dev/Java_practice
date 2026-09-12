interface Vehicle {
  void run();
}

class Car implements Vehicle {
  public void run() {
    System.out.println("ビューン");
  }
}

class Bike implements Vehicle {
  public void run() {
    System.out.println("ドッドッドッ");
  }
}

public class Norimono {
  public static void main(String[] args) {
    Vehicle[] vehicles = {new Car(), new Bike()};
    for (Vehicle v : vehicles) {
      v.run();
    }
  }
}
