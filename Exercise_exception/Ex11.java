public class Ex11 {
  public static void main(String[] args) {
    int retries = 3;
    while (retries > 0) {
      try {
        doTask();
        System.out.println("タスク成功");
        break;
      } catch (Exception e) {
        retries--;
        System.out.println(e.getMessage() + ". 残りリトライ回数: " + retries);
        if (retries == 0) {
          System.out.println("すべてのリトライに失敗しました");
        }
      }
    }
  }

  public static void doTask() throws Exception {
    if (Math.random() < 0.7) {
      throw new Exception("ランダムエラーが発生しました");
    }
  }
}
