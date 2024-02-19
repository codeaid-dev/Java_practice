import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashPassword {
  public static void main(String[] args) {
    String salt = generateSalt();
    System.out.println(salt);
    String password = "12345";
    String hash = hashPassword(password, salt);
    System.out.println(hash);
  
    System.out.println(verifyPassword("12345", hash));
  }

  public static String generateSalt() {
    SecureRandom random = new SecureRandom();
    byte[] salttmp = new byte[16];
    random.nextBytes(salttmp);
    return Base64.getEncoder().encodeToString(salttmp);
  }

  public static String hashPassword(String password, String salt) {
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(Base64.getDecoder().decode(salt));
      byte[] hashedPassword = md.digest(password.getBytes());

      String hash = Base64.getEncoder().encodeToString(hashedPassword);
      return salt + hash;
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static boolean verifyPassword(String password, String hashed) {
    System.out.println(hashed);
    String salt = hashed.substring(0,24);
    System.out.println(salt);
    String check = hashPassword(password, salt);
    System.out.println(check);
    return check.equals(hashed);
  }
}
