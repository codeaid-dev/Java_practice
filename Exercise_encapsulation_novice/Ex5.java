class User {
  private String username;
  private String password;
  public User(String username, String password) {
    this.username = username;
    if (isValidPassword(password)) {
      this.password = password;
    } else {
      System.out.println("パスワードは8文字以上必要です");
    }
  }

  private boolean isValidPassword(String password) {
    return password != null && password.length() >= 8;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
      return password;
  }
}

public class Ex5 {
  public static void main(String[] args) {
    User user = new User("Hoge", "foobarfoobar");
    System.out.println("ユーザー名：" + user.getUsername() + " パスワード：" + user.getPassword());
    User error = new User("Foobar", "1234");
  }
}
