package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestEArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of an array :");
        int arr[]=new int[sc.nextInt()];
           int n=0;
           //int max =arr[0];
        int min = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+n +" element");
            arr[i]=sc.nextInt();
         /* maximum   if (arr[i]>max)
            {
            max=arr[i];
            }   */
            while (arr[i]<min){
                min =arr[i];
            }

            n++;
        }
        //System.out.println( " Largest element is :"+max);
        System.out.println(" Minimum Element is :" + min);
    }
}
