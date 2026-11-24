import java.util.Stack;

public class StackSample {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    // 要素をプッシュ（追加）
    stack.push(10);
    stack.push(20);
    stack.push(30);
    // 要素を確認（先頭の要素を取得）
    System.out.println("Top element: " + stack.peek());
    // 要素をポップ（取り出し）
    System.out.println("Popped element: " + stack.pop());
    // スタックの状態を表示
    System.out.println("Stack after pop: " + stack);
  }
}
