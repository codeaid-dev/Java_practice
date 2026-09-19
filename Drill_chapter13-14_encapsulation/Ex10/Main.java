import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("入力 >>");
    String str = new Scanner(System.in).nextLine();
    String[] strArray = str.split(",");
    int[] intArray = new int[strArray.length];
    for (int i=0; i<strArray.length; i++) {
      intArray[i] = Integer.parseInt(strArray[i]);
    }
    System.out.println("大きい値："+MathUtil.max(intArray[0],intArray[1]));
    System.out.println("最大値："+MathUtil.max(intArray));
    System.out.println("小さい値："+MathUtil.min(intArray[0],intArray[1]));
    System.out.println("最小値："+MathUtil.min(intArray));
    System.out.println("絶対値："+MathUtil.abs(-10));
  }
}
