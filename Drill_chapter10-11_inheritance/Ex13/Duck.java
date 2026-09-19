public class Duck implements Flyable, Swimmable {
  @Override
  public void fly() {
    System.out.println("アヒルは飛んでいる");
  }

  @Override
  public void swim() {
    System.out.println("アヒルは泳いでいる");
  }
}
