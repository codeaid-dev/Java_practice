class Parent {
  String name;
  Parent(String name) {
    this.name = name;
  }
}

class Child extends Parent {
  int age;
  Child(String name, int age) {
    super(name);
    this.age = age;
  }

  void display() {
    System.out.println("名前：" + name + " 年齢：" + age);
  }
}

public class Ex7 {
  public static void main(String[] args) {
    Child child = new Child("三郎", 20);
    child.display();
  }
}
