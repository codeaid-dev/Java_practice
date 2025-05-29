public class Main {
  public static void main(String[] args) {
    VendingMachine vm = new VendingMachine("コーラ", 108);
    vm.displayStatus();
    for (int i = 0; i < 4; i++) {
      System.out.println();
      int change = vm.buy(200);
      System.out.println("お釣り：" + change + "円\n");
      vm.displayStatus();
    }
    System.out.println();
    vm.addStock(1);
    System.out.println();
    int change = vm.buy(200);
    System.out.println("お釣り：" + change + "円\n");
    vm.displayStatus();
  }
}
