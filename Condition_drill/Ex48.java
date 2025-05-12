public class Ex48 {
  public static void main(String[] args) {
    System.out.print("はじめの情報>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] ss = s.split(" ");
    int N=Integer.parseInt(ss[0]);
    int M=Integer.parseInt(ss[1]);
    int L=Integer.parseInt(ss[2]);
    int C=Integer.parseInt(ss[3]);
    String out ="";
    for (int i=0; i<N; i++) {
      System.out.print((i+1)+"行目>>");
      String pickup = new java.util.Scanner(System.in).nextLine();
      String[] pickups = pickup.split(" ");
      for (int j=0; j<M; j++) {
        if (i == L-1 && j == C-1) {
          out = pickups[j];
        }
      }
    }
    System.out.println(L+"行"+C+"列目の整数："+out);
  }
}
