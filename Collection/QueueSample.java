import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    // 要素をエンキュー（追加）
    queue.offer(10);
    queue.offer(20);
    queue.offer(30);
    // 要素を確認（先頭の要素を取得）
    System.out.println("Front element: " + queue.peek());
    // 要素をデキュー（取り出し）
    System.out.println("Dequeued element: " + queue.poll());
    // キューの状態を表示
    System.out.println("Queue after dequeue: " + queue);
  }
}
