public class Main {
  public static void main(String[] args) {
    User user = new User("Hoge", "foobarfoobar");
    System.out.println("ユーザー名：" + user.getUsername() + " パスワード：" + user.getPassword());
    User error = new User("Foobar", "1234");
  }
}
