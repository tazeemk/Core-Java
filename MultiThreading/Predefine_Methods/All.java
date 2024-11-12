package MultiThreading.Predefine_Methods;

import MultiThreading.InterCommunication_Thread.Test;

public class All extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread started ::");
        String name =Thread.currentThread().getName();
        for (int i=0;i<9;i++){

            System.out.println(name +"run "+i);
        }
        try {
            System.out.println("sleep start");
            Thread.sleep(5555);
            System.out.println("sleep end :");
        }catch (Exception e){
            System.out.println("Sleep can't work :");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        All a = new All();
       Thread t = new Thread(a);
       //Thread t1 = new Thread(a);
        //t.start();//t is another executing thread
       // t.join();// join allow CET to wait for compilation of another thread
                 //ie it gives first chance to t and main thread to execute then CET t1

        t.start();//t1 is current executing thread
        t.setName("Thread 1:");
        //a.join();
        a.yield();//handover current thread processor to another but take back as soon as possible
       // t1.setName("Thread 2:");
          t.interrupt();//it is going wake up sleep method
                        //it just disable the functionality of sleep
        for (int i=1;i<5;i++)//here main is also another executing thread
        {
            String s = Thread.currentThread().getName();
            System.out.println(s+ " : main "+i);
        }
    }
}
