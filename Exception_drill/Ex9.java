public class Ex9 {
  public static void main(String[] args) {
    int[] source = {1,2,3};
    System.out.println("処理前："+java.util.Arrays.toString(source));
    try {
      setValue(source, 3);
    } catch(IndexOutOfBoundsException e) {
      System.out.println("インデックスは範囲外です");
    }
    System.out.println("処理後："+java.util.Arrays.toString(source));
  }

  public static void setValue(int[] array, int index) throws IndexOutOfBoundsException {
    array[index] *= 2;
  }
}
