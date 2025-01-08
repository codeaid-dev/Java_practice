class Parent {
  void display() {
    System.out.println("親のdisplayメソッド");
  }
}

class Child extends Parent {
  @Override
  void display() {
    System.out.println("子のdisplayメソッド");
    super.display();
  }
}

public class Ex6 {
  public static void main(String[] args) {
    Child child = new Child();
    child.display();
  }
}
