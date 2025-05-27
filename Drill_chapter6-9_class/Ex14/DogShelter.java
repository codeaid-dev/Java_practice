public class DogShelter {
  Dog[] dogs = new Dog[3];
  int count = 0;

  public void addDog(Dog dog) {
    if (count < dogs.length) {
      dogs[count] = dog;
      count++;
    } else {
      System.out.println("シェルターが満員です");
    }
  }
}
