import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    int[] data = new int[5];
    for (int i = 0; i < data.length; i++) {
      data[i] = new java.util.Random().nextInt(5)+1;
    }
    System.out.print("判定する値: ");
    int num = new Scanner(System.in).nextInt();
//    int num = new Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    boolean found = false;
    for (int n : data) {
      if (n == num) {
        found = true;
        break;
      }
    }
    System.out.println(java.util.Arrays.toString(data));
    if (found) System.out.println("含まれています");
    else System.out.println("含まれていません");
//    System.out.println(found ? "含まれています" : "含まれていません");
  }
}
