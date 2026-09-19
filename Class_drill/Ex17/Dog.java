public class Dog extends Animal{
  public Dog(String name) {
    super(name);
  }
  @Override
  public void speak() {
      System.out.println("ワンワン");
  }
  public void bark() {
      System.out.println("ワォーン");
  }
}
