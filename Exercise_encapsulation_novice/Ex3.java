class Person {
  private String name;
  private int age;
  public Person() {
    this.name = "名無し";
    this.age = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.length() == 0) {
      throw new IllegalArgumentException("名前が不正。処理を中断。");
    }
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("年齢が不正。処理を中断。");
    }
    this.age = age;
  }
}

public class Ex3 {
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println("名前：" + person.getName() + " 年齢：" + person.getAge());
    person.setAge(-1);
    person.setName("山田太郎");
    System.out.println("名前：" + person.getName() + " 年齢：" + person.getAge());
  }
}
