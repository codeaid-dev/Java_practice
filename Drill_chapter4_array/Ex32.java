import java.util.Random;
import java.util.Scanner;

public class Ex32 {
  public static void main(String[] args) {
    String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int hide = new Random().nextInt(alphabet.length);
    String question = "";
    for (int i=0; i<alphabet.length; i++) {
      if (i != hide) {
        question += alphabet[i];
      }
    }
    System.out.println(question);
    System.out.print("抜けているアルファベットは？ ");
    String answer = new Scanner(System.in).nextLine();
//    String answer = new Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (answer.equalsIgnoreCase(alphabet[hide])) {
      System.out.println("正解！");
    } else {
      System.out.println("不正解：正解は「"+alphabet[hide]+"」");
    }
  }
}
