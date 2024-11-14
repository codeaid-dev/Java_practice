public class Dog {
  private String name;
  private int age = 0;
  private static int dogCount = 0;
  public Dog(String name) {
    this.name = name;
    dogCount++;
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
  public String toString() {
    return "Dog{name='" + name + "', age=" + age + "}";
  }
  public static int countDog() {
    return dogCount;
  }
  public static void main(String[] args) {
    Dog g1 = new Dog("Jiro");
    Dog g2 = new Dog("Goro");
    Dog g3 = new Dog("Taro");
    System.out.println("犬は"+Dog.countDog()+"匹");
  }
}
