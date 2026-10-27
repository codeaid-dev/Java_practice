public class Ex37 {
  public static void main(String[] args) {
    int[] nums = {2,4,6,8};
    int total = java.util.Arrays.stream(nums).sum();
    // int total = java.util.stream.IntStream.of(nums).sum();
    int average = total/nums.length;
    System.out.println("平均："+average);
  }
}
