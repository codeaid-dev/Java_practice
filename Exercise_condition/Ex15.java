public class Ex15 {
  public static void main(String[] args) {
    int f = -50;
    while (f <= 50) {
      double c = (double)(f - 32) * 5 / 9;
      System.out.printf("華氏%d度 = 摂氏%.2f度\n",f,c);
      f += 10;
    }
  }
}
