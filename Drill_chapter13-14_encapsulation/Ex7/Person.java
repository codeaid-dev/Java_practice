public class Person {
  private String name;
  private int age;
  public Person(String name, int age) {
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
