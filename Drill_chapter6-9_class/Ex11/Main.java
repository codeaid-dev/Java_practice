import shapes.Rect;
import shapes.Circle;

public class Main {
  public static void main(String[] args) {
    Rect r = new Rect();
    Circle c = new Circle();
    System.out.println("四角形の面積：" + r.area(12,26));
    System.out.println("円の面積：" + c.area(10.5));
  }
}
