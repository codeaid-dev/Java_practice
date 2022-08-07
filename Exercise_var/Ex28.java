package Exercise_var;

public class Ex28 {
  public static void main(String[] args) {
    System.out.print("目 >>");
    String eye = new java.util.Scanner(System.in).nextLine();
    System.out.print("口 >>");
    String mouth = new java.util.Scanner(System.in).nextLine();
    String face = "(^o^)/";
    face = face.replace("^",eye);
    face = face.replace("o",mouth);
    System.out.println(face);
  }
}
