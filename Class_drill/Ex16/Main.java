public class Main {
  public static void main(String[] args) {
    DogShelter ds = new DogShelter();
    Dog d1 = new Dog("Jiro");
    ds.addDog(d1);
    Dog d2 = new Dog("Taro");
    ds.addDog(d2);
    Dog d3 = new Dog("Goro");
    ds.addDog(d3);
    Dog d4 = new Dog("Pochi");
    ds.addDog(d4);
    ds.allBark();
  }
}
