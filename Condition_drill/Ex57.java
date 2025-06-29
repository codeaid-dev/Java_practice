public class Ex57 {
  public static void main(String[] args) {
    System.out.print("入力>>");
    String s = new java.util.Scanner(System.in).nextLine();
//    String s = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    String[] nums = s.split(" ");
    boolean exist = false;
    for (int i=1; i<=10; i++) {
      for (String str : nums) {
        if (str.equals(String.valueOf(i))) {
          exist = true;
        }
      }
      if (!exist) {
        System.out.println(i);
        break;
      } else {
        exist = false;
      }
    }    
  }
}
