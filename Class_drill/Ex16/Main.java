public class Main {
  public static void main(String[] args) {
    Animal[] animals = {new Dog("pochi"), new Cat("tama"), new Pig("babe")};
    for (Animal a : animals) {
      a.speak();
    }
  }
}
