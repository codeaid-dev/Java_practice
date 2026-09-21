public class Cat extends Animal{
  public Cat(String name) {
    super(name);
  }
  @Override
  public void speak() {
      System.out.println("にゃーにゃー");
  }
  public void meow() {
      System.out.println("にゃーん");
  }
}
