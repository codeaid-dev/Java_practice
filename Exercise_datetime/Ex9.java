import java.time.LocalDate;
import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    System.out.print("日付1>>");
    String str1 = new Scanner(System.in).nextLine();
    System.out.print("日付2>>");
    String str2 = new Scanner(System.in).nextLine();
    LocalDate local1 = LocalDate.parse(str1);
    LocalDate local2 = LocalDate.parse(str2);
    if (local1.isBefore(local2)) {
      System.out.println("日付1["+str1+"]は、日付2["+str2+"]より古いです");
    } else if (local1.isAfter(local2)) {
      System.out.println("日付1["+str1+"]は、日付2["+str2+"]より新しいです");
    } else {
      System.out.println("日付1と日付2は同じ日付です");
    }
  }
}
