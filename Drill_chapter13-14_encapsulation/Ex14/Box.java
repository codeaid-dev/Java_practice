public class Box {
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
