public class Main {
  public static void main(String[] args) {
    Animal[] animals = {new Dog("pochi"), new Cat("tama"), new Pig("babe")};
    for (Animal a : animals) {
      if (a instanceof Dog dog) {
        dog.bark();
      } else if (a instanceof Cat cat) {
        cat.meow();
      } else if (a instanceof Pig pig) {
        pig.sounds();
      }
    }
  }
}
