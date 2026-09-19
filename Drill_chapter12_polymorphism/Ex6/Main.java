public class Main {
  public static void main(String[] args) {
    Switch mySwitch = new Switch();
    Command lightOn = new LightOn();
    Command lightOff = new LightOff();

    mySwitch.executeCommand(lightOn);
    mySwitch.executeCommand(lightOff);
  }
}
