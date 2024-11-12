package MultiThreading;

public class Task1 implements Runnable
{
    public void run(){
        for (int i=0;i>50;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Runnable t = new Task1();
        Thread to = new Thread(t);
        to.start();
    }
}
