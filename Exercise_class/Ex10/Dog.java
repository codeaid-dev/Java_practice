public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }
  @Override
  public void speak() {
      System.out.println("ワンワン");
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    g.speak();
  }
}
