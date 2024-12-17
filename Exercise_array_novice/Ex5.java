public class Ex5 {
  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5};
    int target = 6;
    for (int i = 0; i < data.length; i++) {
      for (int j = i + 1; j < data.length; j++) {
        if (data[i] + data[j] == target) {
          System.out.println("(" + data[i] + ", " + data[j] + ")");
        }
      }
    }
  }
}
