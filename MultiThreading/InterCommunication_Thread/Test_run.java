package MultiThreading.InterCommunication_Thread;

public class Test_run
{
    public static void main(String[] args) {
        Test t = new Test();
        new Thread(){
            public void run(){
                try {

                    t.value();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){

            public void run(){
                t.meth();
            }
        }.start();
    }
}
