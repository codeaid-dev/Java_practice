import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.nio.charset.Charset;

public class Ex7Windows {
  public static void main(String[] args) {
    List<String[]> list = new ArrayList<>();
    Charset charset = Charset.forName("MS932");
    try (BufferedReader br = new BufferedReader(
      new InputStreamReader(
        new FileInputStream("inputShiftJIS.csv"),
        charset))) {
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
