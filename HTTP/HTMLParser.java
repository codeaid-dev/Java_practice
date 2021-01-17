import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class HTMLParser {
  public static void main(String[] args) throws IOException {
    ArrayList<String> hierarchy = new ArrayList<String>();
    Document document = Jsoup.parse(new File("output.txt"), "UTF-8");

    Elements finds = document.getElementsContainingOwnText(args[0]);
    for (Element find:finds) {
      System.out.println("<"+find.tagName()+">"+find.html());
      hierarchy.add(find.normalName());
      Element parent = find.parent();
      while (parent != null) {
        hierarchy.add(parent.normalName());
        if (parent.normalName().equals("html")) break;
        parent = parent.parent();
      }
      break;
    }

    Elements els = document.select("img[src*="+args[0]+"]");
    for (Element find:els) {
      System.out.println("<"+find.tagName()+" "+find.attributes().html()+">");
      hierarchy.add(find.normalName());
      Element parent = find.parent();
      while (parent != null) {
        hierarchy.add(parent.normalName());
        if (parent.normalName().equals("html")) break;
        parent = parent.parent();
      }
      break;
    }

    if (hierarchy.size() != 0) {
      String result = String.join("->", hierarchy);
      System.out.println(result);
    }
  }
}
