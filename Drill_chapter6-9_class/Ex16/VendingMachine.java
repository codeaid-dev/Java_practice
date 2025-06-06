public class VendingMachine {
  String name;
  int price;
  int stock;
  int money;
  public VendingMachine(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
    this.money = 0;
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
}
