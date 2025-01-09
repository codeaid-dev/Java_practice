public class Dog {
  String name;
  public Dog(String name) {
    this.name = name;
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    System.out.println("犬の名前は、"+g.name);
  }
}
