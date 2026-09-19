public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rect = new Rect(4, 6);
    System.out.println("円の面積：" + circle.area());
    System.out.println("四角形の面積：" + rect.area());
  }
}
