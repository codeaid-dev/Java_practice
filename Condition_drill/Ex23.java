public class Ex23 {
  public static void main(String[] args) {
    System.out.print("要素数>>");
    int num = new java.util.Scanner(System.in).nextInt();
    String[] result = new String[num];
    for (int i=0; i<num; i++) {
      System.out.print("要素>>");
      String s = new java.util.Scanner(System.in).nextLine();
      result[i] = s;
    }
    System.out.println(java.util.Arrays.toString(result));
  }
}
