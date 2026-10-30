public class Main {
  public static void main(String[] args) {
    TrafficLight light1 = TrafficLight.RED;
    TrafficLight light2 = TrafficLight.YELLOW;
    TrafficLight light3 = TrafficLight.GREEN;

    System.out.println(light1.getMessage());
    System.out.println(light2.getMessage());
    System.out.println(light3.getMessage());
  }
}
