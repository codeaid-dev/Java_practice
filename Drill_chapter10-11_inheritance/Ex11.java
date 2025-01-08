abstract class Animal {
  abstract void sound();
  void sleep() {
      System.out.println("睡眠中。。");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
      System.out.println("わんわん");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
      System.out.println("にゃーにゃー");
  }
}

public class Ex11 {
  public static void main(String[] args) {
      Animal dog = new Dog();
      Animal cat = new Cat();
      dog.sound();
      dog.sleep();
      cat.sound();
      cat.sleep();
  }
}
