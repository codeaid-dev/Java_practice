public class Main {
  public static void main(String[] args) {
    String[] names = {"Pochi", "ハチ"};
    DogShelter ds = new DogShelter();
    for (int i = 0; i < names.length; i++) {
      ds.addDog(new Dog(names[i]));
    }

    Dog dog = ds.findDogByName("ハチ");
    System.out.println("犬の名前: " + dog.name);
    ds.allBark();
  }
}
