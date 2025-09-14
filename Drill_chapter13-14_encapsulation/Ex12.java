class Logger {
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

class Task {
  public void writeLog(String msg) {
    Logger logging = Logger.getInstance();
    logging.log(msg);
  }
}

public class Ex12 {
  public static void main(String[] args) {
    Task t1 = new Task();
    Task t2 = new Task();
    t1.writeLog("タスク1の記録");
    t2.writeLog("タスク2の記録");
  }
}
