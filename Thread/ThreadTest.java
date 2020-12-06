public class ThreadTest implements Runnable{
  public void run() {
    String threadName = Thread.currentThread().getName();
    System.out.println("スレッド" + threadName + "で動いてます");
  }
}
