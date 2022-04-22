class LessBalanceException extends Exception {
  LessBalanceException(String x) {
    super(x);
  }
}

class Account {
  long deposit;
  private final long MINACC = 500;

  Account() {
    deposit = 0l;
  }

  public void deposit(int x) {
    System.out.println("(+)"+x);
    if (deposit + x <= MINACC) {
      System.out.println("^~~ Current Amount is too less Deposit more amount");
      return;
    }

    deposit += x;
  }
  
  public void withdraw(int withdraw) throws LessBalanceException{
    System.out.println("(-)"+withdraw);
    if (deposit - withdraw <= MINACC) {
      throw new LessBalanceException("withdraw amount is not valid");
    }
    deposit -= withdraw;
  }
}


public class Q3 {
  public static void main(String[] args) {
    Account acc = new Account();
    try {
      acc.deposit(300);
      acc.deposit(5000);
      acc.withdraw(100);
      acc.withdraw(10000);

    } catch (LessBalanceException e) {
      System.out.println(e);
    } finally {
      System.out.println("--END--");
    }
  }
}
