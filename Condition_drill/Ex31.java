public class Ex31 {
  public static void main(String[] args) {
    String nums = "2617398540";
    String result = "";
    int key=0;
    for (int i=0; i<nums.length(); i++) {
      if (i == 0) {
        result += nums.charAt(i)+" ";
        key = nums.charAt(i) - '0';
      } else {
        result += nums.charAt(key)+" ";
        key = nums.charAt(key) - '0';
      }
    }
    System.out.println(result);
  }
}
