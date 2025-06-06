public class Ex33 {
  public static void main(String[] args) {
    int months[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int count = 0;

    for (int i = 0; i < months.length; i++) {
      for (int j = 1; j <= days[i]; j++) {
        if (months[i] == (j / 10) + (j % 10)) {
          count++;
          //System.out.printf("%02d/%d%d\n", months[i], (j / 10), (j % 10));
          System.out.println(months[i] + "/" + (j / 10) + (j % 10));
        }
      }
    }
    System.out.println("全部で" + count + "個");
  }
}
