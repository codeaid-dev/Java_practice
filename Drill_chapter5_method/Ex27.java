public class Ex27 {
  public static void main(String[] args) {
    int[] nums = {1,2,2,4,5,6,2,8,8};
    System.out.println(java.util.Arrays.toString(nums));
    System.out.print("削除する要素: ");
    int rnum = new java.util.Scanner(System.in).nextInt();
    int[] result = removeElement(nums, rnum);
    System.out.println(java.util.Arrays.toString(result));
  }
  public static int[] removeElement(int[] array, int value) {
    int count = 0;
    for (int n : array) {
      if (n == value) count++;
    }
    int[] new_array = new int[array.length - count];
    int index = 0;
    for (int n : array) {
      if (n != value) {
        new_array[index] = n;
        index++;
      }
    }
    return new_array;
  }
}
