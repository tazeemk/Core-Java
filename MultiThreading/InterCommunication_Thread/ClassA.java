package MultiThreading.InterCommunication_Thread;

public class ClassA extends Thread
{
    double amount =20000;
   synchronized  void withdraw(int amount) throws Exception
    {
        if (this.amount< amount){
            System.out.println("Insufficient Fund :");
            wait();// here this thread is going to waiting state until
                   //another thread is notify him
            System.out.println("Amount Added Successfully...");
            this.amount -=amount;
            System.out.println("Please Collect Your Cash \n Available Balance is:"+this.amount);

        }else {
            this.amount=amount;
            System.out.println("Transaction Completed Successfully..");
        }
    }
    synchronized void Creadit_Amount(double amount){
        this.amount+=amount;
        System.out.println("Creadited successfully....");
        notify();//here this tread is notify thread which is in wating to starts its execution.
    }
}
