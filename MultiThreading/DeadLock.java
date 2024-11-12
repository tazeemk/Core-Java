package MultiThreading;

public class DeadLock extends Thread
{


   public static void main(String[]args) throws Exception
   {
       String A = "JAVA";
       String B ="PYTHON";
       Thread T1= new Thread()
       { //Anonymous inner class starts here
           @Override
      public  void run()
       {
             synchronized (A){
                 System.out.println("Thread A locked on A ");
                 try {
                     Thread.sleep(10000);
                 }catch (Exception e ){
                     e.printStackTrace();
                 }
             }
           synchronized (B)//Thread will waiting for B
           {
               System.out.println("Thread B Locked on B :");
           }
           System.out.println("no dead lock :");
       }
   };//Anonymous inner Class end here.
       Thread t2 = new Thread()//creating second anonymous class because we cannot write overridden method more than one in implemented class but we can override more than one by using anonymous inner class
       {@Override
       public void run(){
           synchronized (B)//Thread2 is holding Python
           {
               System.out.println("Thread 2 locked on B:");
               try {
                   Thread.sleep(1000);
               }catch (Exception e){
                   e.printStackTrace();
               }
           }
           synchronized (A)//Thread2 will be waiting for A
           {
               System.out.println("Thread 2 Locked on A");
           }
           System.out.println("no dead lock :");
       }

       };
       T1.start();
       t2.start();
   }

}
