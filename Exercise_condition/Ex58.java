public class Ex58 {
  public static void main(String[] args) {
    System.out.print("行と列>>");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] nums = s.split(",");
    int row = Integer.parseInt(nums[0]);
    int col = Integer.parseInt(nums[1]);
    int[][] result = new int[row][col];
    for (int i=0; i<row; i++) {
      for (int j=0; j<col; j++) {
        result[i][j] = 0;
      }
    }
    System.out.println(java.util.Arrays.deepToString(result));
  }
}
