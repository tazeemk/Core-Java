package Exception_Handling;

import java.io.IOException;
import java.util.Scanner;

public class Exception_Prg2
{
       static Scanner sc = new Scanner(System.in);
    static int avl_amt = 20000;
   // int avl_balance;

     void meth1(int wd_amt)  {
         if (avl_amt < wd_amt){
          //  ion("Insufficient fund ::"); throw new IOExcept
         }
         else {
             this.avl_amt=avl_amt-wd_amt;
             System.out.println("Transition Complete Successfully..........");
             System.out.println("PLEASE PRESS ::");
             System.out.println("1.TO SEE AVAILABLE BALANCE ::");
             System.out.println("2.WITHDRAW AGAIN ::");
             System.out.println("3.EXIT ::");
             int i =sc.nextInt();
             switch (i) {
                 case 1 :
                 System.out.println("Available Balance ::" + avl_amt);
                break;
                 case 2 :
                     System.out.println("\nPlease Enter Your Withdraw Amount ::");
                      meth1(sc.nextInt());
                      break;
                 case 3 :
                     return;
                 default:
                     System.out.println("Please choice valid number ::");
             }
         }

     }

    public static void main(String[] args) {
        Exception_Prg2 eobj = new Exception_Prg2();
        //eobj.avl_amt=8000;
        System.out.println("\nPlease Enter Your Withdraw Amount ::");
        eobj.meth1(sc.nextInt());
        //eobj.meth1(500);
    }



}
