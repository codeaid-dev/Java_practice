public class Ex17 {
  public static void main(String[] args) {
    int n=5;
    String star="";
    for (int i=1; i<n; i++) {
      for (int j=0; j<i; j++) {
        star += "*";
      }
      star += "\n";
    }
    for (int i=n; i>=0; i--) {
      for (int j=0; j<i; j++) {
        star += "*";
      }
      star += "\n";
    }
    System.out.print(star);
  }
}
