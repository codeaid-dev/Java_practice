class Dog extends Pet implements Animal {
  @Override
  public void move() {
    System.out.println("犬は走っている");
  }
}
