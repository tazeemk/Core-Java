package MultiThreading.Task;

public class BankTransaction  implements Runnable
{
    BankAccount account = new BankAccount();
    double amount;
    boolean isDeposit;
    @Override
    public void run(){
       // account.deposite();
 if (isDeposit==true)
 {
     amount+=account.balance;
 }
 else {
     account.withdraw(100);
 }

    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        Thread t = new Thread(account1);
    }
}
