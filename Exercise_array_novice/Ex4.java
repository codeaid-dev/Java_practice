public class Ex4 {
  public static void main(String[] args) {
    int[] data = new int[5];
    for (int i = 0; i < data.length; i++) {
      data[i] = new java.util.Random().nextInt(15)+5;
    }
    int max = data[0];
    for (int n : data) {
      if (n > max) {
        max = n;
      }
    }
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("最大値：" + max);
  }
}
