public class SwitchSample {
  public static void main(String[] args) {
    int val = 2;
    switch (val) {
      case 1:
        System.out.println("変数valは1");
        break;
      case 2:
        System.out.println("変数valは2");
        break;
      case 3:
        System.out.println("変数valは3");
        break;
      default:
        System.out.println("変数valは1,2,3のどれでもない");
    }
  }
}
