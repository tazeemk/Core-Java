package Collection.Collection_Tasks;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayList_Task
{
    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        int a=0;
        ArrayList<Integer>al = new ArrayList<Integer>();
        for (int i=0;i<=5;i++)
        {
            System.out.println("Enter the "+a+" Element");
               al.add(sc.nextInt());
               a++;
        }
        System.out.println(al.size());
        System.out.println(al);
        System.out.println("Sorting in Ascending order :");
        TreeSet<Integer>t =new TreeSet<Integer>(al);
        System.out.println(t);
        System.out.println("Maximum Element :"+t.last());
        System.out.println("Lowest Element :"+t.first());
    }

    public static void main(String[] args) {
        ArrayList_Task obj = new ArrayList_Task();
        obj.meth1();
    }
}
