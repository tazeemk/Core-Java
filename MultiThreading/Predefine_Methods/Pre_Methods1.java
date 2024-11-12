package MultiThreading.Predefine_Methods;

public class Pre_Methods1 extends Thread
{
public void run(){
    System.out.println("PRE_METHOD RUN() METHOD ::");
    for (int i = 0; i <= 5; i++)
    {
      //  String name =Pre_Methods1.currentThread().getName();
        System.out.println(" run meth() :"+i);
    }
}
}
