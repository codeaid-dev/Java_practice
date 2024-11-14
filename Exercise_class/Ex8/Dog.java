public class Dog {
  private String name;
  private int age = 0;
  private static int dogCount = 0;
  private String[] tricks;
  public Dog(String name) {
    this.name = name;
    dogCount++;
    this.tricks = new String[5];
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
  public void addTrick(String trick) {
    for (int i = 0; i < tricks.length; i++) {
        if (tricks[i] == null) {
            tricks[i] = trick;
            break;
        }
    }
  }
  public void showTricks() {
    for (String trick : tricks) {
        if (trick != null) {
            System.out.println(trick);
        }
    }
}
  public static void main(String[] args) {
    Dog g = new Dog("Jiro");
    g.addTrick("お手");
    g.addTrick("お座り");
    g.addTrick("伏せ");
    g.showTricks();
  }
}
