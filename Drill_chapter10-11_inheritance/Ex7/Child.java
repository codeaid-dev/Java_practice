public class Child extends Parent {
  int age;
  public Child(String name, int age) {
    super(name);
    this.age = age;
  }

  void display() {
    System.out.println("名前：" + name + " 年齢：" + age);
  }
}
