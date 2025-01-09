public class Dog {
  private String name;
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
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    System.out.println(g.getName());
    g.setName("Goro");
    System.out.println(g.getName());
  }
}
