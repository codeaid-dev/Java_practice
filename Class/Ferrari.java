public class Ferrari extends Car {
  public Ferrari(String type) {
    super(type);
  }
  public void run() {
    System.out.println("ビューン！");
  }
  // public void sound() {
  //   System.out.println("ブルンブルン");
  // }
  public static void main(String[] args) {
    Ferrari f = new Ferrari("スポーツカー");
    // Car f = new Ferrari("スポーツカー");
    f.run();
    // Ferrari f2 = (Ferrari)f;
    // f2.sound();
    System.out.println("車種："+f.type);
  }
}
