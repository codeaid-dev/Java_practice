public class Dog {
  private String name;
  private int age = 0;
  public Dog(String name) {
    this.name = name;
  }
  public void bark() {
    System.out.println("ワンワン");
  }
  public void bark(int times) {
    for (int i=0; i<times; i++) {
      System.out.println("ワンワン");
    }
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  @Override
  public String toString() {
    return "Dog{name='" + name + "', age=" + age + "}";
  }
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    g.setAge(15);
    System.out.println(g.toString());
  }
}
