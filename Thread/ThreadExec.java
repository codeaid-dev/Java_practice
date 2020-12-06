public class ThreadExec {
  public static void main(String[] args) {
    ThreadTest tt = new ThreadTest();
    Thread t1 = new Thread(tt);
    Thread t2 = new Thread(tt);
    Thread t3 = new Thread(tt);
    t1.start();
    t2.start();
    t3.start();
  }
}
