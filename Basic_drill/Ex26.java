public class Ex26 {
  public static void main(String[] args) {
    System.out.print("目 >>");
    String eye = new java.util.Scanner(System.in).nextLine();
//    String eye = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("口 >>");
    String mouth = new java.util.Scanner(System.in).nextLine();
//    String mouth = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String face = "(^o^)/";
    face = face.replace("^",eye);
    face = face.replace("o",mouth);
    System.out.println(face);
  }
}
