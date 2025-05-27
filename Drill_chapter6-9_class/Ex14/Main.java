public class Main {
  public static void main(String[] args) {
    String[] names = {"Pochi", "ハチ", "Jiro", "太郎"};
    DogShelter ds = new DogShelter();
    for (int i = 0; i < names.length; i++) {
      ds.addDog(new Dog(names[i]));
    }
  }
}
