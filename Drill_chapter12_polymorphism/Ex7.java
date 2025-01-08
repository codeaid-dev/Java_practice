class Animal {}

class Dog extends Animal {
  void bark() {
    System.out.println("わんわん");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("にゃーにゃー");
  }
}

public class Ex7 {
  public static void main(String[] args) {
    Animal[] animals = {new Dog(), new Cat()};
    Animal animal = animals[new java.util.Random().nextInt(2)];
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.bark();
    } else if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      cat.meow();
    }
  }
}
