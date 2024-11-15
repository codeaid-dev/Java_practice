public class DogShelter {
    private Dog[] dogs = new Dog[3];
    private int count = 0;

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        } else {
            System.out.println("シェルターが満員です");
        }
    }
    public void allBark() {
      for (int i = 0; i < count; i++) {
          dogs[i].bark();
      }
  }
}
