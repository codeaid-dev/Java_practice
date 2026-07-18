import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex7 {
  public static void main(String[] args) {
    List<String[]> list = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
      br.readLine();
      String line;
      while((line = br.readLine()) != null){
        list.add(line.split(","));
      }
      list.sort(Comparator.comparing(data -> data[0]));
      System.out.println("名前,スコア");
      for(String[] data : list){
        System.out.println(data[0] + "," + data[1]);
      }
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
