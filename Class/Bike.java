public class Bike implements Vehicle,Aircraft {
  public void run() {
    System.out.println("ドッドッドッ");
  }
  public void fly() {
    System.out.println("ブーン");
  }
  public static void main(String[] args) {
    Bike b = new Bike();
    b.run();
    b.fly();
  }
}
