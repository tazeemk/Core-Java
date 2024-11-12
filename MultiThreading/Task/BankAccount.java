package MultiThreading.Task;

public class BankAccount extends Thread
{
    double balance;
    String AccountNumber;
   synchronized public void withdraw(double balance ){
        this.balance=balance;
    }
    synchronized public void deposite(double balance){
        this.balance -=balance;
    }
    public double getBalance(){
        return balance;
    }

}
