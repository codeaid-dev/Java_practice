class Parent {
  String name = "親";
}

class Child extends Parent {
  String name = "子";
  void printNames() {
    System.out.println("Parentクラス：" + super.name);
    System.out.println("Childクラス：" + name);
  }
}

public class Ex5 {
  public static void main(String[] args) {
      Child child = new Child();
      child.printNames();
  }
}
