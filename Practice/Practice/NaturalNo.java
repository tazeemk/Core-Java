package Practice;

import java.util.Scanner;

public class NaturalNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int no = sc.nextInt();
        if (no%2==0)
        {
            System.out.println(no+ ":  Is Even ");
        }else {
            System.out.println(no +":  Is Odd ");
        }
    }
}
