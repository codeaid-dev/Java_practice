public class Ex1 {
  public static void main(String[] args) {
    int[] data = new int[5];
    for (int i = 0; i < data.length; i++) {
      data[i] = i*2+2;
    }
    System.out.println(java.util.Arrays.toString(data));
  }
}
