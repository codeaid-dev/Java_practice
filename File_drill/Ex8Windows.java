import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex8Windows {
  public static void main(String[] args) {
    List<Player> list = new ArrayList<>();
    Charset charset = Charset.forName("MS932");
    try (BufferedReader br = new BufferedReader(
      new InputStreamReader(
        new FileInputStream("inputShiftJIS.csv"),
        charset))) {
      br.readLine();
      String line;
      while((line = br.readLine()) != null){
        String[] data = line.split(",");
        list.add(new Player(data[0],
              Integer.parseInt(data[1])));
      }
      list.sort(Comparator.comparing((Player p) -> p.score).reversed());
      System.out.println("名前,スコア,順位");
      int rank = 1;
      for(Player player : list){
        System.out.println(player.name + "," + player.score+","+rank+"位");
        rank++;
      }
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}

class Player {
  String name;
  int score;
  public Player(String name, int score) {
    this.name = name;
    this.score = score;
  }
}