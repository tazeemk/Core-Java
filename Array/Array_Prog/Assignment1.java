package Array_Prog;

import java.util.Arrays;
import java.util.Scanner;

 public class Assignment1
{
  static   Scanner sc = new Scanner(System.in);
    String[] meth1(int arr1[],char arr2[],boolean arr3[])
    {
        System.out.println("ENTER "+arr1.length + " INTEGER VALUES ::");
         for ( int i =0;i<arr1.length;i++)
         {
              arr1[i] = sc.nextInt();

         }
         /*for (int data:arr1){
             System.out.print(data +"  " );
         }*/
        System.out.println("VALUES IN INT ARE :: "+Arrays.toString(arr1)+"\n");
        //System.out.println(arr2.length);
        System.out.println("PRINTING CHARACTER VALUES::\n");
        for (int j = 0;j<arr2.length;j++)
        {
            //arr2[2]='D';
            //arr2[0]='A';
            //arr2[4]='B';
            System.out.println(arr2[j]);
        }
        System.out.println("PRINTING BOOLEAN VALUES::\n");
        for(int i=0;i<arr3.length;i++){
            arr3[i]= sc.nextBoolean();
        }
        System.out.println("BOOLEAN VALUES ARE:::"+Arrays.toString(arr3));
        return null;
    }

    public static void main(String[] args) {
        //System.out.println("ENTER INTEGER VALUES::");
        System.out.println("VALUE RETURN BY METH1 IS :: "+ new Assignment1().meth1(new int[5],new char[]{'A','B'},new boolean[3]));
    }
}

