package MultiThreading.Predefine_Methods;

public class Pre_Meth_Access
{
    public static void main(String[] args) throws Exception
    {
        Pre_Methods1 pm = new Pre_Methods1();
       // pm.setName(" Pre_method class thread first : ");
     //   Pre_Methods1 pm5 = new Pre_Methods1();
       // pm5.setName("CREATED SECOND THREAD OF PRE_METH CLASS ::");
       // pm.start();
     //   pm5.start();

        pm.start();
        pm.yield();//here current thread will handover the proccessor to another thread with same
        //priority but will take back the proccessor soon
        //pm.join();//here current thread is main thread but join method is allows to current thread
        //to wait until the compilation of another thread i,e pre_meth class thread
        //i,e first another than current thread will execute :
        for (int i = 0; i <=5; i++)
        {
            System.out.println("main meth "+i);
        }

    }
}
