package MultiThreading;

import java.util.concurrent.Callable;

public class ClassA extends Thread
{
    @Override
    synchronized public void run(){
        String name = Thread.currentThread().getName();//Getting name
       int pr= Thread.currentThread().getPriority();//getting priority
        for (int i=0;i<5;i++)
        {
            System.out.println(name+ "("+ pr +")"  +" run"+i);
        }
        meth();
    }
    //Creating thread inside meth process or method
synchronized void meth(){
        String name = Thread.currentThread().getName();
        for (int j=0;j<7;j++){
            System.out.println(name +" "+j);
        }
 }
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        Thread t = new Thread(aobj);//Creating first thread
        t.setName("Thread 1");//setting name for first thread
        t.setPriority(10);//Setting priority for first thread
        t.start();//starting first thread
        Thread t1 = new Thread(aobj);//Creating second thread
        t1.setName("Thread 2");//Setting name for second thread
        t1.start();//starting second thread
    }
}
