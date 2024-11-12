package MultiThreading.Group_Thread;

import javax.swing.*;

public class Group_Thread_Test extends Thread
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() +" "+Thread.currentThread().getPriority() );
    }

    public static void main(String[] args) {
        Group_Thread_Test gobj = new Group_Thread_Test();
        ThreadGroup t = new ThreadGroup("Parent ");//Creating Group
        t.setMaxPriority(10);
        Thread t1 = new Thread(t,gobj,"one");//groupName,thread obj ,thradName
        t1.start();
        Thread t2 = new Thread(t,gobj,"two");
        t2.start();
Thread t3 = new Thread(t,gobj,"Three");
t3.start();

        System.out.println("Thread GroupName "+t.getName());
        System.out.println("Active Thread "+t.activeCount());
    }


}
