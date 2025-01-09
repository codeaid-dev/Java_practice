public class Ex17 {
  public static void main(String[] args) {
    int num = new java.util.Random().nextInt(20)+1;
    String result = "";
    for (int i=1; i<=20; i++) {
      if (num%i == 0) {
        result += i+"x"+(num/i)+"="+num+" ";
      }
    }
    System.out.println(result);
  }
}
