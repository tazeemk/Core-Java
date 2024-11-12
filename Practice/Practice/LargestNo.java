package Practice;

import java.util.Scanner;

public class LargestNo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int a =sc.nextInt();
        System.out.println("Enter number2");
        int b = sc.nextInt();
        System.out.println("Enter Number3");
        int c = sc.nextInt();
        if (a>b)
        {
            System.out.println(" number1 is largest ");

            }else if (b>c){
            System.out.println("number2 is largest ");

            }else {
            System.out.println("number3 is largest ");
        }
    }
}
