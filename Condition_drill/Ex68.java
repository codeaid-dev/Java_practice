public class Ex68 {
  public static void main(String[] args) {
    int ele=0;
    while (ele < 2 || ele > 5) {
      System.out.print("問題数: ");
      ele = new java.util.Scanner(System.in).nextInt();
//      ele = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    }
    for (int i = 0; i < ele; i++) {
      int num1 = new java.util.Random().nextInt(9)+1;
      int num2 = new java.util.Random().nextInt(9)+1;
      int res = num1 + num2;
      System.out.println(num1 + " + ? = " + res);
      System.out.print("解答: ");
      int answer = new java.util.Scanner(System.in).nextInt();
//      int answer = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
      if (answer == num2) {
        System.out.println("正解");
      } else {
        System.out.println("不正解(正解:" + num2 + ")");
      }
    }
  }
}
