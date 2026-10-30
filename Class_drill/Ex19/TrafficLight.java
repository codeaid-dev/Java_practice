public enum TrafficLight {
  RED,
  YELLOW,
  GREEN;

  public String getMessage() {
    return switch (this) {
      case RED -> "停止してください";
      case YELLOW -> "注意してください";
      case GREEN -> "進んでください";
    };
  }
}
