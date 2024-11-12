package MultiThreading.Predefine_Methods;

public class Interrupt extends Thread
{
    public void run() {
        System.out.println(" Ready for interviews ::");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ready for " + i+" Interview :");
        }
        try {
            System.out.println("Got placed ::");

            sleep(5555);
            System.out.println("Going to sleep ...");

        }catch (Exception e){
            System.out.println("Distrubuied in sleeping :");
        }
        System.out.println("Wake up Ready to go Office ::");

    }

    public static void main(String[] args) {
        Interrupt i = new Interrupt();
        i.start();
        i.interrupt();//Interrup method is going to wake up the sleep()
        //Interrup method will execute only when sleep method present in thread
    }
}
