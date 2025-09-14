class Box {
  private static int activeCount = 0;
  private static final int MAX_BOXES = 3;

  private Box() {
    activeCount++;
  }

  public static Box createInstance() {
    if (activeCount < MAX_BOXES) {
      return new Box();
    } else {
      return null; // 制限超過
    }
  }
}

public class Ex14 {
  public static void main(String[] args) {
    Box b1 = Box.createInstance();
    if (b1 == null) { System.out.println("b1はnullです"); }
    Box b2 = Box.createInstance();
    if (b2 == null) { System.out.println("b2はnullです"); }
    Box b3 = Box.createInstance();
    if (b3 == null) { System.out.println("b3はnullです"); }
    Box b4 = Box.createInstance();
    if (b4 == null) { System.out.println("b4はnullです"); }
  }
}
