public class User {
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
