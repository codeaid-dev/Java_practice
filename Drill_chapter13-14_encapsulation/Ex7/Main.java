public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("山田太郎", 25);
    Person p2 = new Person("山田太郎", 25);
    Person p3 = new Person("田中二郎", 30);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
  }
}
