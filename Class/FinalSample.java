public class FinalSample {
  public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println("半径2.5の円の面積："+circle.getCircleArea(2.5));
    // CircleのPIを使って計算
    System.out.println("半径3.5の円の面積："+3.5*3.5*Circle.PI);
  }
}
