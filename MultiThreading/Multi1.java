package MultiThreading;

public class Multi1 extends Thread
{
    //We can acheive multithreading by two ways
    //1.by extends Thread class
    //2.by implementing Runnable Interface
// run is method of runnable interface which is extends in Thread class also because Thread class is child
    // class of Runnable Interface
    @Override
    public void run() {
        for (int i=1;i<100;i++){
            System.out.println("value of i "+i);
        }
    }

    public static void main(String[] args) {
        Multi1 mobj = new Multi1();
        Thread t1 = new Thread(mobj);
        for (int j=100;j<150;j++){
            System.out.println("value of j "+j);
        }
        t1.start();
        //start method by deafult call the run method present in aur class
    }
}
