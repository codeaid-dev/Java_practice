public class Ex8 {
  public static void main(String[] args) {
    int cnt = 0;
    for (int i = 1; i <= 30; i++) {
      cnt += i;
      if (i == 10 || i == 20 || i == 30) {
        System.out.println((i-9) + "から" + i + "の合計：" + cnt);
        cnt = 0;
      }
    }
  }
}
