public class Ex22 {
  public static void main(String[] args) {
    for (int i=1; i<=10; i++) {
      int dice1 = new java.util.Random().nextInt(6)+1;
      int dice2 = new java.util.Random().nextInt(6)+1;
      System.out.println(i+"回目："+dice1+","+dice2);
      if (dice1 == dice2) {
        if (dice1%2 == 0) {
          System.out.println("大当たり");
        } else {
          System.out.println("当たり");
        }
        break;
      }
    }
  }
}
