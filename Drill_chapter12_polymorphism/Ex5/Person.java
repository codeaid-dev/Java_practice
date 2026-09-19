public class Person {
  String name;
  int age;
  public Person(String name) {
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void display() {
    System.out.println("名前：" + name + ", 年齢：" + age);
  }
}
