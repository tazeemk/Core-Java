package MultiThreading.InterCommunication_Thread;

public class Access_A
{
    public static void main(String[] args)
    {
        ClassA aobj = new ClassA();
        new Thread(){
            @Override
              public void run(){

                try {
                    aobj.withdraw(30000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();
new Thread(){
    public void run(){
        aobj.Creadit_Amount(90000);
    }
}.start();

    }
}
