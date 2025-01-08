class A {
  void methodA() {
    System.out.println("Aクラスのメソッド");
  }
}

class B extends A {
  void methodB() {
    System.out.println("Bクラスのメソッド");
  }
}

class C extends B {
  void methodC() {
    System.out.println("Cクラスのメソッド");
  }
}

public class Ex8 {
  public static void main(String[] args) {
    C obj = new C();
    obj.methodA();
    obj.methodB();
    obj.methodC();
  }
}
