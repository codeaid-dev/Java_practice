public class Dog {
  private String breed;
//  String breed;
  String size;
  int age;
  String color;

  public Dog(String breed, String size,
            int age, String color) {
    this.breed = breed;
    this.size = size;
    this.age = age;
    this.color = color;
  }
  public boolean setBreed(String breed) {
    if (!breed.equals("雑種")) {
      this.breed = breed;
      return true;
    }
    return false;
  }
  public String getBreed() {
    return this.breed;
  }

  public void showData() {
    System.out.println("犬種は、" + breed);
    System.out.println("大きさは、" + size);
    System.out.println("年齢は、" + age + "歳");
    System.out.println("色は、" + color);
  }

  public static void main(String[] args) {
    /* クラス定義
    Dog dog = new Dog();
    dog.breed = "柴犬";
    dog.size = "中型犬";
    dog.age = 3;
    dog.color = "茶色";
    */
    /* コンストラクタ
    Dog dog = new Dog("柴犬","中型犬",3,"茶色");
    dog.showData();
    */
    /* インスタンス */
    Dog dog1 = new Dog("柴犬","中型犬",3,"茶色");
    Dog dog2 = new Dog("秋田犬","中型犬",5,"白色");
    Dog dog3 = new Dog("マルチーズ","小型犬",2,"白色");
    dog1.showData();
    dog2.showData();
    dog3.showData();
  }
}
