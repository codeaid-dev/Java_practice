public class Ex23 {
  public static void main(String[] args) {
    System.out.print("要素数>>");
    int num = new java.util.Scanner(System.in).nextInt();
//    int num = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    String[] result = new String[num];
    for (int i=0; i<num; i++) {
      System.out.print("要素>>");
      String s = new java.util.Scanner(System.in).nextLine();
//      String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
      result[i] = s;
    }
    System.out.println(java.util.Arrays.toString(result));
  }
}
