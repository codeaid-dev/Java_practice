import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashSample {
  private static final String SALT = "E2k6h:Z5xp%@0?PEongh@:@mkHc>wS;G";
  public static void main(String[] args) {
    System.out.print("データ1：");
    String s1 = new java.util.Scanner(System.in).nextLine();
    System.out.print("データ2：");
    String s2 = new java.util.Scanner(System.in).nextLine();

    String res1 = hash(s1+SALT);
    System.out.println(res1);
    String res2 = hash(s2+SALT);
    System.out.println(res2);
    if (res1.equals(res2)) {
      System.out.println("2つのデータは同じ");
    } else {
      System.out.println("2つのデータは違う");
    }
  }
  private static String hash(String text) {
    String res = null;
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(text.getBytes());
      byte[] digest = md.digest();
      res = new String(digest, "UTF-8");
    } catch(NoSuchAlgorithmException e) {
      System.out.println(e.getLocalizedMessage());
    } catch(UnsupportedEncodingException e) {
      System.out.println(e.getLocalizedMessage());
    }
    return res;
  }
}
