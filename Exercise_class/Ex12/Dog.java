public class Dog extends Animal implements Playable, Trainable {
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
  @Override
  public void train() {
      System.out.println("トレーニング中");
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    g.train();
  }
}
