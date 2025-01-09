public class Ex12 {
  public static void main(String[] args) {
    int yen1=2,yen5=1;
    int total = yen5 * 5 + yen1;
    for (int i=1; i<=total; i++) {
      if (i%5 <= yen1) {
        System.out.println(i);
      }
    }
  }
}
