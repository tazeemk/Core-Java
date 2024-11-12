package MultiThreading.Predefine_Methods;

public class sleep extends Thread
{
    /*public void run() {
        System.out.println("run() of sleep class ::");
        for (int i=1;i<=5;i++){
            System.out.println("run(): "+i);
           try {
               sleep.sleep(5555);
               System.out.println("waiting.........");
           }catch (Exception e){
               System.out.println("sleep can't be handled :");
           }
            System.out.println("after sleep ::");
           }
    }*/
 // public void meth(){
//      System.out.println("sleep class meth() :");
  //}
    public static void main(String[] args)throws Exception
    {
 // sleep s = new sleep();
  //s.start();
        System.out.print("waiting.");
         sleep.sleep(5000);
        System.out.print("..");
        sleep(5000);
        System.out.println("...");
    }
}
