public class Ex20 {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String s = new java.util.Scanner(System.in).nextLine();
    int total=0;
    for (int i=1; i<=3; i++) {
      String work = "";
      for (int j=0; j<i; j++) {
        work += s;
      }
      System.out.print(work + " ");
      total += Integer.parseInt(work);
    }
    System.out.println("");
    System.out.println(total);
  }
}
