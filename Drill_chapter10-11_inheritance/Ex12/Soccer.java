public class Soccer extends Game {
  @Override
  void initialize() {
    System.out.println("サッカー、セットアップ");
  }

  @Override
  void start() {
    System.out.println("キックオフ");
  }

  @Override
  void end() {
    System.out.println("タイムアップ");
  }
}
