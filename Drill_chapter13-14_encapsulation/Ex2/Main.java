public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println("名前：" + person.getName() + " 年齢：" + person.getAge());
    person.setAge(25);
    person.setName("山田太郎");
    System.out.println("名前：" + person.getName() + " 年齢：" + person.getAge());
  }
}
