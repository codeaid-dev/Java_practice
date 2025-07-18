public class Ex15 {
  public static void main(String[] args) {
    int total=0,cnt=0,num=0;
    do {
      System.out.print("入力>>");
      num = new java.util.Scanner(System.in).nextInt();
//      num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
      total += num;
      if (num != 0) cnt++;
    } while (num != 0);
    System.out.println(cnt+"回入力・合計"+total+"・平均"+((double)total/cnt));
  }
}
