public class Ex22 {
  public static void main(String[] args) {
    int num = 7536;
    System.out.println(num);
    String result = "";
    while (num > 0) {
      result += (num%10)+" ";
      num = num/10;
    }
    System.out.println(result);
  }
}
