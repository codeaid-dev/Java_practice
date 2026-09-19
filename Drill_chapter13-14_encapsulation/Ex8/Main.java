public class Main {
  public static void main(String[] args) {
//    Counter.increment();
//    Counter.increment();
//    Counter.increment();
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.increment();
    c1.increment();
    c2.increment();
    c2.increment();
    System.out.println(Counter.count);
  }
}
