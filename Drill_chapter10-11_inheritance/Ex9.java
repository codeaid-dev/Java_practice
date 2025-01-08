interface Animal {
  void move();
}

class Pet {
  void play() {
    System.out.println("遊んでいる");
  }
}

class Dog extends Pet implements Animal {
  @Override
  public void move() {
    System.out.println("犬は走っている");
  }
}

public class Ex9 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.play();
    dog.move();
  }
}
