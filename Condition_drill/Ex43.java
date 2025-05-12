public class Ex43 {
  public static void main(String[] args) {
    int r=0,b=0,w=0;
    for (int i=0; i<3; i++) {
      int num = new java.util.Random().nextInt(3)+1;
      if (num == 1) {
        r += 1;
      } else if (num == 2) {
        b += 1;
      } else {
        w += 1;
      }
    }
    if (r == 3 || b == 3 || w == 3 || (r == 1 && b == 1 && w == 1)) {
        System.out.println("赤が"+r+"、青が"+b+"、白が"+w+"で勝ち");
    } else {
        System.out.println("赤が"+r+"、青が"+b+"、白が"+w+"で負け");
    }
  }
}
