public class Person {
  String name;
  int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
  }
  public static void main(String[] args) {
    Person p = new Person("Yamada",28);
    System.out.println(p.toString());
  }
}
