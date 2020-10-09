import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FromToFile {
  public static void main(String[] args) {
    String str;

    try {
      FileReader isr = new FileReader("input.txt");
      BufferedReader br = new BufferedReader(isr);
      FileWriter fw = new FileWriter("output.txt");
      PrintWriter pw = new PrintWriter(fw);

      str = br.readLine();
      while(str != null) {
        //str = reversed(str);
        //str = str.toLowerCase();
        str = str.toUpperCase();
        pw.println(str);
        str = br.readLine();
      }
      br.close();
      pw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static String reversed (String str) {
    char[] ch = str.toCharArray();

    for (int i = 0; i < str.length(); i++) {
      if (ch[i] >= 'a' && ch[i] <= 'z') {
        ch[i] -= 32;
      } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
        ch[i] += 32;
      }
    }
    return new String(ch);
  }
}
