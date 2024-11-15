public abstract class Vehicle {
  private String type;
  public Vehicle(String type) {
    this.type = type;
  }
  public abstract void refuel(double amount);
  public abstract void accelerate();
  public abstract void accelerate(int increase);
}
