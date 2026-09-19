public class Main {
  public static void main(String[] args) {
    User user = User.getInstance("Hoge", "foobarfoobar");
    System.out.println("ユーザー名：" + user.getUsername() + " パスワード：" + user.getPassword());
    User user2 = User.getInstance("Foobar", "1234");
    if (user2 == null)
      System.out.println("userがnullです");
  }
}
