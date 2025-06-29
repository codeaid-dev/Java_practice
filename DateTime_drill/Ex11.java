public class Ex11 {
  public static void main(String[] args) {
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String question = "";
    while (question.length() < 10) {
      int index = new java.util.Random().nextInt(alphabet.length());
      char c = alphabet.charAt(index);
      question += c;
    }
    long start = System.currentTimeMillis();
    System.out.println(question);
    System.out.print("入力 >>");
    String answer = new java.util.Scanner(System.in).nextLine();
//    String answer = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    if (answer.equals(question)) {
      long end = System.currentTimeMillis();
      System.out.println("正解です：かかった時間は" + ((double)(end - start)/1000) + "秒でした");
    } else {
      System.out.println("間違いです");
    }
  }
}
