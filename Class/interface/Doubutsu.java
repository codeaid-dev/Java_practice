interface Animal {}

class Dog implements Animal {
  void bark() {
    System.out.println("わんわん");
  }
}

class Cat implements Animal {
  void meow() {
    System.out.println("にゃーにゃー");
  }
}

public class Doubutsu {
  public static void main(String[] args) {
    Animal[] animals = {new Dog(), new Cat()};
    Animal animal =
    animals[new java.util.Random().nextInt(2)];
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
      dog.bark();
    } else if (animal instanceof Cat) {
      Cat cat = (Cat) animal;
      cat.meow();
    }
  }
}
