import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class HTMLSearch {
  public static void main(String[] args) throws Exception {
    String search = args[0];
    String str;

    FileReader isr = new FileReader("output.txt");
    BufferedReader br = new BufferedReader(isr);

    String tag="";
    ArrayList<String> hierarchy = new ArrayList<String>();
    str = br.readLine();
    while(str != null) {
      StringBuilder substr = new StringBuilder(str);
      while(substr.length() != 0) {
        int index1 = substr.indexOf("<");
        if (index1 != -1) {
          if (substr.charAt(index1+1) == '!') {
            substr.delete(0, substr.length());
            break;
          }
          int index2 = substr.indexOf(" ", index1);
          int index3 = substr.indexOf(">", index1);
          if (index2 != -1 && index3 != -1) {
            if (index2 < index3) {
              tag = substr.substring(index1+1, index2);
              substr = substr.replace(index1, index3+1, "");
            } else {
              tag = substr.substring(index1+1, index3);
              substr = substr.replace(index1, index3+1, "");
            }
          } else if (index3 != -1) {
            tag = substr.substring(index1+1, index3);
            substr = substr.replace(index1, index3+1, "");
          }
          if (tag.charAt(0) != '/' && tag.charAt(0) != '!') {
            hierarchy.add(tag);
          }
        } else {
          substr.delete(0, substr.length());
        }
      }

      if (str.indexOf(search) != -1) {
        System.out.println(str);
        Collections.reverse(hierarchy);
        String result = String.join("->", hierarchy);
        System.out.println(result);
        break;
      }
      //System.out.println(str);
      str = br.readLine();
    }
    System.out.println("end of file loading");
    br.close();
  }
}
