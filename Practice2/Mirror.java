import java.util.Scanner;

public class Mirror {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    str = str.trim();

    String result = "";
    for(int i = str.length() - 1; i >= 0; i--) {
      if(str.charAt(i) == '>') {
        result += "<";
      } else {
        result += ">";
      }
    }
    System.out.println(result);
    scan.close();
  }
}
