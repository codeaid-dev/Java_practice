public class Ex20 {
  public static void main(String[] args) {
    String word = "   Hello World!   ";
    System.out.println(word.stripTrailing()+":");
    System.out.println(word.stripLeading()+":");
    System.out.println(word.strip()+":");
//    System.out.println(word.trim()+":");
  }
}
