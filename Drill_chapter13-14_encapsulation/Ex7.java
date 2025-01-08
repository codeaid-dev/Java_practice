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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof Person person) {
      return age == person.age && name.equals(person.name);
    }
    return false;
  }
}

public class Ex7 {
  public static void main(String[] args) {
    Person p1 = new Person("山田太郎", 25);
    Person p2 = new Person("山田太郎", 25);
    Person p3 = new Person("田中二郎", 30);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
  }
}
