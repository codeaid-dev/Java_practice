public class Ex23 {
  public static void main(String[] args) {
    int cnt = 0;
    for (int i = 128; i <= 256; i++) {
      if (i % 8 == 0) {
        System.out.print(i + " ");
        cnt++;
      }
    }
    System.out.println("");
    System.out.println("8の倍数は" + cnt + "個");
  }
}
