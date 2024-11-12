package Array_Prog;

import java.util.Arrays;
import java.util.Scanner;

public class Task3
{
  static Scanner sc = new Scanner(System.in);
    void meth3(int []arr)
    {

        for(int i =0;i<arr.length;i++)
        {
            System.out.println("enter the for array");
              arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // return arr[i];
    }
    void meth2(){
        System.out.println("ENTER THE LENGTH OF THE ARRAY:: ");
        String arr1[]= new String[sc.nextInt()];
        int j=1;
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println("ENTER THE "+j+ " NAME::");
            arr1[i]=sc.next();
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        //t.meth3(new int[6]);
        t.meth2();
        //int input[];
         // int  result  =sc.nextInt();
        //System.out.println("calculating two element of array is ::" +t.meth3());
    }
}
