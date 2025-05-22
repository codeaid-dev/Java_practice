public class Ex20 {
  public static void main(String[] args) {
    int[] arr1 = new int[7];
    int[] arr2 = new int[7];
    String result = "";
    for (int i=0; i<arr1.length; i++) {
      arr1[i] = new java.util.Random().nextInt(9)+1;
      arr2[i] = new java.util.Random().nextInt(9)+1;
      if (arr1[i] + arr2[i] > 9) {
        result += i+"番目の値("+arr1[i]+","+arr2[i]+")\n";
      }
    }
    System.out.println(java.util.Arrays.toString(arr1));
    System.out.println(java.util.Arrays.toString(arr2));
    System.out.print(result);
  }
}
