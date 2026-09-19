class Child extends Parent {
  @Override
  void showMessage() {
    System.out.println("Override Message from Child");
  }

  void showMessage(String msg) {
    System.out.println("Overload Message: " + msg);
  }
}
