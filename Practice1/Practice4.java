public class Practice4 {
  public static void main(String[] args) {
    System.out.print("年齢 >>");
    int age = new java.util.Scanner(System.in).nextInt();
//    int age = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    if (age < 20) {
      if (age >= 1 && age <= 6) {
        System.out.println("幼児");
      } else if (age >= 7 && age <= 15) {
        System.out.println("未成年（義務教育対象）");
      } else {
        System.out.println("未成年");
      }
    } else if (age >= 65) {
      if (age >= 75) {
        System.out.println("後期高齢者");
      } else {
        System.out.println("高齢者");
      }
    } else {
        System.out.println("成人");
    }
  }
}
