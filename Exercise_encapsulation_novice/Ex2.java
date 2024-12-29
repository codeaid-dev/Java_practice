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
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

public class Ex2 {
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println("名前：" + person.getName() + " 年齢：" + person.getAge());
    person.setAge(25);
    person.setName("山田太郎");
    System.out.println("名前：" + person.getName() + " 年齢：" + person.getAge());
  }
}