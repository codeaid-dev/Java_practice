class Player {
  private String name;
  private int score;
  private static Player[] players = new Player[5];
  private static int playerCount = 0;

  public Player(String name, int score) {
    this.name = name;
    this.score = score;
    if (playerCount < players.length) {
      players[playerCount] = this;
      playerCount++;
    } else {
      System.out.println("プレイヤーの登録上限に達しました");
    }
  }

  public int getScore() {
    return score;
  }

  public static double getAverageScore() {
    if (playerCount == 0) return 0.0;
    int sum = 0;
    for (int i = 0; i < playerCount; i++) {
      sum += players[i].getScore();
    }
    return (double) sum / players.length;
  }
}

public class Ex15 {
  public static void main(String[] args) {
    Player p1 = new Player("P1", 80);
    Player p2 = new Player("P2", 70);
    Player p3 = new Player("P3", 100);
    Player p4 = new Player("P4", 60);
    Player p5 = new Player("P5", 90);
    System.out.println("平均スコア："+Player.getAverageScore());

    Player p6 = new Player("P6", 75);
  }
}
