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

public class Ex1 {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();
    myDog.speak();
    myCat.speak();
  }
}
