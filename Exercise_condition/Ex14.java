public class Ex14 {
  public static void main(String[] args) {
    int total=0,cnt=0;
    System.out.print("入力>>");
    int num = new java.util.Scanner(System.in).nextInt();
    while (num != 0) {
      total += num;
      cnt++;
      System.out.print("入力>>");
      num = new java.util.Scanner(System.in).nextInt();
    }
    System.out.println(cnt+"回入力・合計"+total+"・平均"+((double)total/cnt));
  }
}
