public class Logger {
  private static Logger instance = null;

  private Logger() {} // 外部からnewできない

  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(String msg) {
    System.out.println("[LOG] " + msg);
  }
}
