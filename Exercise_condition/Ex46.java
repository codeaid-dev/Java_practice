public class Ex46 {
  public static void main(String[] args) {
    int[] nums = {10,20,30,20,10,50,60,40,80,50,0,40};
    String result = "";
    for (int n : nums) {
      if (result.indexOf(Integer.toString(n)) == -1 && n != 0) {
        result += n+" ";
      }
    }
    System.out.println(result);
  }
}
