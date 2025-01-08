class Person {
  String name;
  void displayInfo() {
    System.out.println("Name: " + name);
  }
}

class Student extends Person {
  int studentId;
  void displayId() {
    System.out.println("Student ID: " + studentId);
  }
}

public class Ex3 {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "田中二郎";
    student.studentId = 12345;
    student.displayInfo();
    student.displayId();
  }
}
