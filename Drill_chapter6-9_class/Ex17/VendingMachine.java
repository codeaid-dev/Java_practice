public class VendingMachine {
  String name;
  int price;
  int stock;
  int money;
  public VendingMachine(String name, int price, int stock, int money) {
    this.name = name;
    this.price = price;
    this.stock = stock;
    this.money = money;
  }
  public VendingMachine(String name, int price) {
    this.name = name;
    this.price = price;
    this.stock = 3;
    this.money = 0;
  }

  public void displayStatus() {
    System.out.println("*** 自動販売機の状態 ***");
    System.out.println("商品名：" + name);
    System.out.println("価格：" + price + "円");
    System.out.println("在庫：" + stock);
    System.out.println("売上金額：" + money + "円");
  }

  public int buy(int payment) {
    int change = 0;
    if (stock > 0 && payment >= price) {
      change = payment - price;
      stock--;
      money += price;
      System.out.println(payment + "円で商品を購入しました");
    } else {
      System.out.println("購入できません");
    }
    return change;
  }

  public void addStock(int amount) {
    stock += amount;
    System.out.println(amount + "個の在庫を補充しました");
  }
}
