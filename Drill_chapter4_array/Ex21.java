public class Ex21 {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    System.out.print("ローテート数: ");
    int rotate = new java.util.Scanner(System.in).nextInt();
//    int rotate = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    for (int r = 0; r < rotate; r++) {
      int first = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
        numbers[i - 1] = numbers[i];
      }
      numbers[numbers.length - 1] = first;
    }

    System.out.println("ローテートした配列: " + java.util.Arrays.toString(numbers));
  }
}
