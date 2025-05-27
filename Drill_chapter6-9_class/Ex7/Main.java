import com.example.utils.Counter;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter();
    for (int i = 0; i < 10; i++) {
      counter.increment();
    }
    for (int i = 0; i < 5; i++) {
      counter.decrement();
    }
    System.out.println("結果：" + counter.getCount());
  }
}
