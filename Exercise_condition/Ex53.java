public class Ex53 {
  public static void main(String[] args) {
    String[] pair = {"Q", "A"};
    String[] result = new String[8];
    for (int i=0; i<result.length; ) {
      for (int n=0; n<2; n++) {
        result[i] = pair[n]+(i/2+1);
        i++;
      }
    }
    System.out.println(java.util.Arrays.toString(result));
  }
}
