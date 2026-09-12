class User {
  private String username;
  private String password;
  private User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public static User getInstance(String username, String password) {
    if (isValidPassword(password) && username != null && username.length() != 0) {
      return new User(username, password);
    } else {
      System.out.println("パスワードは8文字以上必要です");
      return null;
    }
  }

  private static boolean isValidPassword(String password) {
    return password != null && password.length() >= 8;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
      return password;
  }
}

public class Ex5extra {
  public static void main(String[] args) {
    User user = User.getInstance("Hoge", "foobarfoobar");
    System.out.println("ユーザー名：" + user.getUsername() + " パスワード：" + user.getPassword());
    User user2 = User.getInstance("Foobar", "1234");
    if (user2 == null)
      System.out.println("userがnullです");
  }
}
