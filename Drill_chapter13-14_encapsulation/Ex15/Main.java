public class Main {
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
