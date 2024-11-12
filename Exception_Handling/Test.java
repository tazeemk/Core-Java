package Exception_Handling;

public class Test
{
    public void meth1()
    {
        System.out.println("meth1() Called ::");
        try {
            //In try block we can write suspicious code in which exception can occur
            System.out.println("Try block executed::");
            System.out.println(10);
            System.out.println(20/0);
            System.out.println(30);
        }
        catch (ArithmeticException e)
        {
            // In catch block Exception Case
            //catch block only execute when exception occurs
            System.out.println("catch block executed ::");
            //System.out.println("Can't Divided by Zero ");
           // e.printStackTrace();

        }
        finally {
            // In finally block we can close connection
            //Finally block always executed
            System.out.println("finally block called ");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.meth1();
    }
}
