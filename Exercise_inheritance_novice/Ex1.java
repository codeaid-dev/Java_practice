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

public class Ex1 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.speak();
//    Animal an = new Animal();
//    an.speak();
  }
}
