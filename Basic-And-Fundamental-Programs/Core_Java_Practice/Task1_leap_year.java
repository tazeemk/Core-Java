package Core_Java_Practice;

import java.util.Scanner;

public class Task1_leap_year
{
    void years()
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year =sc.nextInt();

        if((year%4)==0)
        {
            System.out.println(year+" is leap year :");
        }else {
            System.out.println(year+" is not leap year :");
        }


    }

    public static void main(String[] args) {
        new Task1_leap_year().years();
    }

}
