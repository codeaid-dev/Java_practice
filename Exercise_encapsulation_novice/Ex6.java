class Person {
  private String name;
  private int age;
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "名前：" + name + ", 年齢：" + age;
  }
}

public class Ex6 {
  public static void main(String[] args) {
    Person person = new Person("山田太郎", 25);
    System.out.println(person);
  }
}
