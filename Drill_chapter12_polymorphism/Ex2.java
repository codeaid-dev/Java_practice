class Animal {
  void speak() {
    System.out.println("動物の鳴き声");
  }
}

class Dog extends Animal {
  @Override
  void speak() {
    System.out.println("わんわん");
  }
}

class Cat extends Animal {
  @Override
  void speak() {
    System.out.println("にゃーにゃー");
  }
}

public class Ex2 {
  public static void main(String[] args) {
    Animal[] animals = { new Dog(), new Cat() };
    for (Animal animal : animals) {
      animal.speak();
    }
  }
}