public class Ex56 {
  public static void main(String[] args) {
    String[] alph = {"A","B","C","D","E","F","G","H","I","J"};
    int ans = new java.util.Random().nextInt(alph.length);
    String ques = "";
    for (int i=0; i<alph.length; i++) {
      if (i != ans) {
        ques += alph[i];
      }
    }
    System.out.println(ques);
    System.out.print("抜けているアルファベットは？");
    String s = new java.util.Scanner(System.in).nextLine();
    s = s.toUpperCase();
    if (s.equals(alph[ans])) {
      System.out.println("正解です");
    } else {
      System.out.println("間違いです");
    }
  }
}
