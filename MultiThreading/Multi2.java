package MultiThreading;

public class Multi2 extends Thread
{
    //run method is used to create thread
    public void run(){
        //
        String name=Thread.currentThread().getName();

        System.out.println("");
        for (int i=1;i<=5;i++){
            System.out.println(name+"run() :"+i);
        }

    }

    public static void main(String[] args) {
        Multi2 m2 = new Multi2();
        //here create 1st thread t1
        Thread t1 = new Thread(m2);
        //here creating 2nd thread t2
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
        //here using set method to passing name to thread t1
        t1.setName("First Thread  starts :");
        //here using set method to passing name to thread t2
        t2.setName("Second Thread starts :");

    }
}
