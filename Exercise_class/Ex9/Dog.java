public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    System.out.println("犬の名前は、"+g.getName());
  }
}
