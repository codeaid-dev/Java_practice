public class Child extends Parent {
  String name = "子";
  void printNames() {
    System.out.println("Parentクラス：" + super.name);
    System.out.println("Childクラス：" + name);
  }
}
