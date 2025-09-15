class User {
  private static int nextId = 1;
  private int id;
  private String name;

  public User(String name) {
    this.id = nextId++;
    this.name = name;
  }

  public void showUserInfo() {
    System.out.println("ID: " + id + ", Name: " + name);
  }
}

public class Ex13 {
  public static void main(String[] args) {
    User u1 = new User("高橋");
    User u2 = new User("鈴木");
    User u3 = new User("斎藤");
    u1.showUserInfo();
    u2.showUserInfo();
    u3.showUserInfo();
  }
}
