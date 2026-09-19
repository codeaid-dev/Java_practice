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
