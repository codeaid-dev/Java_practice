//public class Car {
public abstract class Car {
    String type;
  public Car(String type) {
    this.type = type;
  }
  public abstract void run();
//  public void run() {
//    System.out.println("ブッブー");
//  }
}
