public class Child extends Parent {
  @Override
  void display() {
    System.out.println("子のdisplayメソッド");
    super.display();
  }
}
