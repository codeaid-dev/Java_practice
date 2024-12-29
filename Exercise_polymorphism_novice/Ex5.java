class Person {
  String name;
  int age;
  Person(String name) {
    this.name = name;
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void display() {
    System.out.println("名前：" + name + ", 年齢：" + age);
  }
}

class Student extends Person {
  String school;
  Student(String name, int age, String school) {
    super(name, age);
    this.school = school;
  }

  @Override
  void display() {
    super.display();
    System.out.println("学校：" + school);
  }
}

public class Ex5 {
  public static void main(String[] args) {
    Student student = new Student("斉藤四郎", 20, "ABC専門学校");
    student.display();
  }
}
