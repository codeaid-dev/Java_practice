import com.example.utils.Person;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("山田太郎");
    Person p2 = new Person();
    p1.showName();
    p2.showName();
  }
}
