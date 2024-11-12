package Array_Prog;

import java.util.Arrays;
import java.util.Scanner;

public class Input_Array
{
    Scanner sc = new Scanner(System.in);
    void meth1()
    {
        System.out.println("meth1 called :");
        int arr1[]= new int[5];
        System.out.println("PLEASE ENTER "+arr1.length +"VALUES :");
        for(int i=0;i<arr1.length;i++)
        {
           arr1[1] =sc.nextInt();

        }
        System.out.println("vlaue in "+arr1.length+" is"+ Arrays.toString(arr1));
      String name[] = new String[arr1.length];
      for(int j =0;j<arr1.length;j++)
      {
          System.out.println("enter names::");
          name[j]=sc.next();
      }
    }

    public static void main(String[] args) {
        new Input_Array().meth1();
    }

}
