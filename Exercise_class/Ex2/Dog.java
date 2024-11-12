public class Dog {
  String name;
  public Dog(String name) {
    this.name = name;
  }
  public void bark() {
    System.out.println("ワンワン");
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    g.bark();
//    System.out.println("犬の名前は、"+g.name);
  }
}
