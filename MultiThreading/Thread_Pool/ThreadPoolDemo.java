package MultiThreading.Thread_Pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo extends Thread
{
    String message; //taking a instance variable to pass message
    ThreadPoolDemo(String msg){//assigning value of instance variable
        this.message=msg;
    }
    synchronized public void run()//Implementing Thread
    {
        System.out.println(Thread.currentThread().getName() +" (Beginning Message )"+message);
        processMessage();
        System.out.println( Thread.currentThread().getName() +"Ending ");
    }
   private void processMessage() //Creating method to sleep the thread
   {
        try {
            sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Creating three Thread pool By using predefined executor class
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i =1;i<=5;i++)//five iteration
        {//creating obj for our class and assigning instance variable value
            ThreadPoolDemo tpobj = new ThreadPoolDemo(" "+i);
            Thread t = new Thread(tpobj);//Creating thread
            executor.execute(t);//assigning thread to worker thread which we created through Executor class
        }
        executor.shutdown();
        while (!executor.isTerminated())//here terminating the worker thread
        {}
            System.out.println("Finished all threads :");

    }
}
