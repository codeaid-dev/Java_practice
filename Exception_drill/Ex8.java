public class Ex8 {
  public static void main(String[] args) {
    int[] source = {1,2,3};
    System.out.println("処理前："+java.util.Arrays.toString(source));
    try {
      setValue(source, 3);
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("処理後："+java.util.Arrays.toString(source));
  }

  public static void setValue(int[] array, int index) {
    if (index < 0 || index > array.length-1)
      throw new IllegalArgumentException("引数が間違ってます");
    array[index] *= 2;
  }
}
