public class Ex55 {
  public static void main(String[] args) {
    String[] questions = {"桜の咲く季節は？","点を取ると大きくなる動物は？","パンでも固くて食べられないパンは？"};
    String[] answers = {"春","犬","フライパン"};
    for (int i=0; i<questions.length; i++) {
      System.out.print(questions[i]);
      String a = new java.util.Scanner(System.in).nextLine();
//      String a = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
      if (answers[i].equals(a)) {
        System.out.println("正解です");
      } else {
        System.out.println("不正解です");
      }
    }
  }
}
