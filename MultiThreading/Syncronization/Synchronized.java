package MultiThreading.Syncronization;

public class Synchronized extends Thread
{
    //It Controls the multiple thread to access the same Shared  resource
    //in order to prevent inconsistent state
    //making only one thread to  access the resource and moving all the treads(who are trying to access same resource)
    // into waiting state
//we can acheive synchronization into two ways
//By synchronized method
//by synchronize block
@Override
public void run()
{
meth1();
}
 synchronized void meth1()
  {
    String name = Thread.currentThread().getName();
     System.out.println(name+" Start");
    for (int i=1;i<=5; i++)
    {
        System.out.println(name+" thread :"+i);
        try {
            sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    System.out.println(name +" end :");
}


    public static void main(String[] args) {

       Synchronized sobj = new Synchronized();
       Thread t = new Thread(sobj);
       Thread t1 = new Thread(sobj);
       t.setName("Devang :");
       t1.setName("Sufiyan :");
       t.start();
       t1.start();
       t1.setPriority(10);

     //  for (int i=1;i<=5;i++){
       //    String name =
         //  System.out.println("main ");
       //}

    }


}
