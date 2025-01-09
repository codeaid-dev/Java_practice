public class Ex30 {
  public static void main(String[] args) {
    int cnt=0;
    String res="";
    while (true) {
      int num = new java.util.Random().nextInt(100)+1;
      if (num%2 == 0) {
        if (res.indexOf(String.valueOf(num)) == -1) {
          res += num+" ";
          cnt++;
          if (cnt == 10) {
            break;
          }
        }
      }
    }
    System.out.println(res);
  }
}
