package Exception_Handling;

import Practice.ClassA;

import java.util.Scanner;

public class Excption_Prog1 {
     Scanner sc = new Scanner(System.in);
String s[]= new String[5];


    public void meth1()
    {
        s[0]="kishan";
        s[1]="java";
        try {
            System.out.println("try block executed ::");
            System.out.println("Enter Number TO dived :: ::");
            System.out.println(20/sc.nextInt());
            System.out.println("Enter the Index position to show result ::");
            System.out.println(s[sc.nextInt()].toUpperCase());
            System.out.println(30);
        }
        catch (ArithmeticException | NullPointerException e){

        }
       /* catch (ArithmeticException e)
        {
            System.out.println("1st catch block executed:");
            e.printStackTrace();
        }
        catch (NullPointerException e){
            System.out.println("2nd catch block executed:");
            e.printStackTrace();
        }*/
        finally {
            sc.close();
            System.out.println("finally block executed ::");
        }
    }
    public void meth2() throws Exception
    {
        //try("file path ")
        //{
         //   System.out.println();
        //}
    }


    public static void main(String[] args) {
Excption_Prog1 ep = new Excption_Prog1();
ep.meth1();

    }
}