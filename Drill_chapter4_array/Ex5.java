public class Ex5 {
  public static void main(String[] args) {
    int[] data = {10, 20, 30, 40};
    int sum = 0;
    for (int num : data) {
      sum += num;
    }
    double average = (double) sum / data.length;
    System.out.println("平均値：" + average);
  }
}
