public class Ex7 {
  public static void main(String[] args) {
    int[][][] nums = {{{10}},{{20}},{{300},{400},{5000,6000},{500}},{{30}},{{40}}};
    nums[2][2][0] = 0;
    System.out.println(java.util.Arrays.deepToString(nums));
  }
}
