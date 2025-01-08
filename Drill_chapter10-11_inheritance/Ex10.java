class Parent {
  void showMessage() {
    System.out.println("Message from Parent");
  }
}

class Child extends Parent {
  @Override
  void showMessage() {
    System.out.println("Override Message from Child");
  }

  void showMessage(String msg) {
    System.out.println("Overload Message: " + msg);
  }
}

public class Ex10 {
  public static void main(String[] args) {
    Child child = new Child();
    child.showMessage();
    child.showMessage("Hello World");
  }
}
