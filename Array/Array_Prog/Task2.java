package Array_Prog;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    Scanner sc = new Scanner(System.in);


    void meth()
    {
        System.out.println("enetr total number of students ::");
        int st = sc.nextInt();
        int j = 1;

        int arr[] = new int[st];
        System.out.println("after finish");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("enter the values :: "+ j +"students");
              arr[i]= sc.nextInt();

             j++;
            //System.out.println(data);

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Task2 aobj = new Task2();
         aobj.meth();
    }
}


