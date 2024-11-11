import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionSample {
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("data.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
//      e.printStackTrace();
    }
  }
}
