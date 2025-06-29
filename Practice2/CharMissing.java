import java.util.Scanner;

public class CharMissing {
  public static void main(String[] args) {
    String alp[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};
    int hide = (int)(Math.random() * 26);
    String str = "";
    for (int i=0; i<alp.length; i++) {
      if (i != hide) {
        str += alp[i];
      }
    }
    System.out.println(str + "\n");
    System.out.print("抜けているのは？>");
    Scanner scan = new Scanner(System.in);
//    Scanner scan = new Scanner(System.in, "Shift-JIS"); //for Windows
    String ans = scan.nextLine();

    if (ans.equalsIgnoreCase(alp[hide])) {
      System.out.println("正解！\n");
    } else {
      System.out.println("不正解\n正解は「"+alp[hide]+"」\n");
    }
    scan.close();
  }
}
