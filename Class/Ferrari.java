public class Ferrari extends Car {
  public Ferrari(String type) {
    super(type);
  }
  public void run() {
    System.out.println("ビューン！");
  }
  public static void main(String[] args) {
    Ferrari f = new Ferrari("スポーツカー");
    f.run();
    System.out.println("車種："+f.type);
  }
}
