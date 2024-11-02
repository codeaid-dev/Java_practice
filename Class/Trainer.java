public class Trainer {
  public static void main(String[] args) {
    Dog dog = new Dog("柴犬","中型犬",3,"茶色");
    dog.showData();
    // dog.breed = "雑種"; // privateのフィールドではエラーとなる
    dog.setBreed("雑種");
    dog.showData();
    dog.setBreed("土佐犬");
    dog.showData();
    System.out.println("取得した犬種："+dog.getBreed());
  }
}
