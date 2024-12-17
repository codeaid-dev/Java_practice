public class Ex22 {
  public static void main(String[] args) {
    int pay = 10000;
    int point = 0, month = 0;
    while (point <= 20000) {
      month += 1;
      point += pay * 0.05;
    }
    System.out.println("ポイント金額が20000円を超えるのは" + month + "ヶ月後");
  }
}
