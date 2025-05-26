public class Ex14 {
  public static void main(String[] args) {
    int[] nums1 = {1,2,3,4,5};
    int[] nums2 = {1,2,3,4,5};
    if (arraysEqual(nums1, nums2)) {
      System.out.println("2つの配列の要素は同じです");
    } else {
      System.out.println("2つの配列の要素は違います");
    }
  }
  public static boolean arraysEqual(int[] data1, int[] data2) {
    int count = 0;
    for (int i = 0; i < data1.length; i++) {
      if (data1[i] == data2[i]) count++;
    }
    if (data1.length == count) return true;
    else return false;
  }
}
