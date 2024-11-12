package Core_Java_Practice;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Task4
{


    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        final int x=sc.nextInt();
        System.out.println("meth1() :");
        int arr[]= {1,2,3,4,5,6,7,8,9,0};
        //int[] ar=new int[arr.length];
    for (int i=0;i<=arr.length-1;i++)
    {
        for (int j=0;j<=arr.length-1;j++)
        {
            for (int k=0;k<=arr.length-1;k++){

                if (arr[i]*arr[j]*arr[k]==72){
                 int ar =arr[i]*arr[j]*arr[k];
                    System.out.println(ar);
                }
            }

        }
       // System.out.println(Arrays.toString(ar));
    }

    }

    public static void main(String[] args) {
        new Task4().meth1();
    }
}
