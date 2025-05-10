public class SwitchSample {
  public static void main(String[] args) {
    int val = 2;
    switch (val) {
      case 1 -> {
        System.out.println("変数valは1");
      }
      case 2 -> {
        System.out.println("変数valは2");
      }
      case 3 -> {
        System.out.println("変数valは3");
      }
      default -> {
        System.out.println("変数valは1,2,3のどれでもない");
      }
    }
  }
}
