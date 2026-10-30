import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int price = 10000;
    String[] members = {"yamada","tanaka","suzuki","sato"};
    MemberRank[] ranks = {MemberRank.BRONZE,MemberRank.GOLD,MemberRank.PLATINUM,MemberRank.SILVER};
    System.out.print("入力>>");
    String member = new Scanner(System.in).nextLine();
    MemberRank rank = MemberRank.BRONZE;
    for (int i=0; i<members.length; i++) {
      if (members[i].equals(member)) {
        rank = ranks[i];
      }
    }
    System.out.println("会員名：" + member);
    System.out.println("会員ランク：" + rank);
    System.out.println("購入金額：" + price + "円");
    System.out.println("割引率：" + rank.getDiscountRate() + "%");
    System.out.println("割引後の金額：" + rank.calculatePrice(price) + "円");
  }
}
