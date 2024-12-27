abstract class Game {
  abstract void initialize();
  abstract void start();
  abstract void end();

  public final void play() {
      initialize();
      start();
      end();
  }
}

class Chess extends Game {
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

class Soccer extends Game {
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

public class Ex12 {
  public static void main(String[] args) {
      Game chess = new Chess();
      chess.play();
      Game soccer = new Soccer();
      soccer.play();
  }
}
