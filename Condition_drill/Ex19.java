public class Ex19 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
    int cnt=0;
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      cnt=0;
      for (int j=0; j<s.length(); j++) {
        if (c == s.charAt(j)) {
          cnt++;
        }
      }
      if (cnt>=2) {
        break;
      }
    }
    if (cnt>=2) {
      System.out.println("複数あります");
    } else {
      System.out.println("複数ありません");
    }
  }
}
