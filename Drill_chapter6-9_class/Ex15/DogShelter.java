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

  public Dog findDogByName(String name) {
    for (int i = 0; i < count; i++) {
      if (dogs[i].name.equals(name)) {
        return dogs[i];
      }
    }
    return null;
  }

  public void allBark() {
    for (int i = 0; i < count; i++) {
      System.out.println(dogs[i].name + "が吠えている");
      dogs[i].bark();
    }
  }
}
