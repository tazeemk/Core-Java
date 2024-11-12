package OOPS.Encapsulation;

import java.util.Scanner;

public class Access_Bank
{
    Scanner sc = new Scanner(System.in);
    void Access(){
        Bank_Account ba = new Bank_Account();
        System.out.println("Please Enter you Account Number ::");
        ba.setAcount_Number(sc.nextDouble());
        System.out.println("Enter you OTP :: ");
        ba.setOtp(sc.nextInt());
        System.out.println("Please Enter Your Name::");
        ba.setName(sc.next());

        System.out.println("Customer Details are ::");

        System.out.println("Bank Account Number is ::"+ba.getAcount_Number());
        System.out.println("OTP is ::"+ba.getOtp());
        System.out.println("Account Holder Name is ::"+ba.getName());


    }

    public static void main(String[] args) {
        Access_Bank ac = new Access_Bank();
        ac.Access();
    }
}
