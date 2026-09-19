public class BankAccount {
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
