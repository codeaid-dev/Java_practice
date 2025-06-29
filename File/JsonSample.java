import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Iterator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonSample {
  public static void main(String[] args) {
    //String script = "{\"Yamada\":\"abcde\"}";
    System.out.print("ユーザー名 >>");
    String username = new java.util.Scanner(System.in).nextLine();
//    String username = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("パスワード >>");
    String password = new java.util.Scanner(System.in).nextLine();
//    String password = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows

    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    File json = new File("sample.json");
    if (json.exists()) { //ファイルが存在する
      /* try {
          User user = mapper.readValue(script, User.class);
          System.out.println(user.username);
      } catch (IOException e) {
          e.printStackTrace();
      } */

      try {
        JsonNode root = mapper.readTree(json);
        Iterator<String> fieldNames = root.fieldNames();
        while (fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            System.out.println(fieldName);
            JsonNode node = root.get(fieldName);
            System.out.println(node.toString());
        }
        ObjectNode onode = root.deepCopy();
        onode.put(username, password);
        mapper.writeValue(json, onode);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else { //ファイルがない
      try {
        ObjectNode root = mapper.createObjectNode();
        FileOutputStream fos = new FileOutputStream(json);
        root.put(username, password);
        mapper.writeValue(fos, root);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
/*
class User {
  public String username;
  public String password;
}
*/