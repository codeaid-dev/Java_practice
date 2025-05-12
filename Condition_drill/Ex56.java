import java.util.Random;
import java.util.Scanner;

public class Ex56 {
  public static void main(String[] args) {
    String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};
    int hide = new Random().nextInt(26);
    String question = "";
    for (int i=0; i<alphabet.length; i++) {
      if (i != hide) {
        question += alphabet[i];
      }
    }
    System.out.println(question);
    System.out.print("抜けているアルファベットは？ ");
    String answer = new Scanner(System.in).nextLine();
    if (answer.equals(alphabet[hide])) {
//    if (answer.equalsIgnoreCase(alphabet[hide])) {
      System.out.println("正解！");
    } else {
      System.out.println("不正解：正解は「"+alphabet[hide]+"」");
    }
  }
}
