public class Task {
  public void writeLog(String msg) {
    Logger logging = Logger.getInstance();
    logging.log(msg);
  }
}
