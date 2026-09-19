public class Chess extends Game {
  @Override
  void initialize() {
    System.out.println("チェス、セットアップ");
  }

  @Override
  void start() {
    System.out.println("チェス、スタート");
  }

  @Override
  void end() {
    System.out.println("チェックメイト");
  }
}
