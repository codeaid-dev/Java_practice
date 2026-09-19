public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(1000);
    account.withdraw(500);
    System.out.println("預金：" + account.getBalance());
    account.deposit(0);
    account.withdraw(600);
  }
}
