package MultiThreading.InterCommunication_Thread;

public class Test extends Thread
{
    int x=55;
    int y;
   synchronized public void value()throws Exception
    {

            System.out.println("enter in try");
            wait();
        System.out.println(" a value added :");
          // Thread.sleep(5555);
         int sum= x/y;
        System.out.println(sum);

    }
    synchronized public void meth() {
        y = 5;
        notify();

    }


    }

