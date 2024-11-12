package MultiThreading;

public class Deamon_Thread extends Thread
{
    public void run(){
        int i =1;
         while (true){
            System.out.println(i++);
        }
    }

    public static void main(String[] args) {

        Deamon_Thread dt = new Deamon_Thread();

        Thread to = new Thread(dt);
        to.setDaemon(true);
        to.start();

        for (int i=5;i<55;i++){
            System.out.println("main "+i);
        }


    }
}
