interface Command {
  void execute();
}

class LightOn implements Command {
  @Override
  public void execute() {
    System.out.println("ライト点灯");
  }
}

class LightOff implements Command {
  @Override
  public void execute() {
    System.out.println("ライト消灯");
  }
}

class Switch {
  void executeCommand(Command command) {
    command.execute();
  }
}

public class Ex6 {
  public static void main(String[] args) {
    Switch mySwitch = new Switch();
    Command lightOn = new LightOn();
    Command lightOff = new LightOff();

    mySwitch.executeCommand(lightOn);
    mySwitch.executeCommand(lightOff);
  }
}
