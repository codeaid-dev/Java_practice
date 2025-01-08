class BankAccount {
  private double balance;
  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("入金は正の数でなければなりません");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("預金が不足しているか、金額が無効です");
    }
  }
}

public class Ex4 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(1000);
    account.withdraw(500);
    System.out.println("預金：" + account.getBalance());
    account.deposit(0);
    account.withdraw(600);
  }
}