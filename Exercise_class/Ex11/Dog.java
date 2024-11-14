public class Dog extends Animal implements Playable {
  public Dog(String name) {
    super(name);
  }
  @Override
  public void speak() {
      System.out.println("ワンワン");
  }
  @Override
  public void play() {
      System.out.println("遊んでいます");
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    g.play();
  }
}
