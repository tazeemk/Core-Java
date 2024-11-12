package Collection.List.ArrayList.ArrayList_Task;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1
{
    public ArrayList<Integer> meth1(int arr[],ArrayList<String>al1,ArrayList<Integer>al2)
    {
    //Task1 Printing arrr[] in reverse order
        System.out.println("******************Task1*********************");
       for (int i= arr.length-1;i>=0;i--)
       {
           System.out.print(arr[i] +" ");
       }
       //Task2 Printing ArrayList with Iterator Interface
        System.out.println("\n******************Task2*********************");
        Iterator<String> i= al1.iterator();

        while (i.hasNext()){
            System.out.print(i.next().toUpperCase() +" ");
        }
        //Task3 Printing ArrayList<Integer> into reverse Order
        System.out.println("\n*******************Task3*************************");

        for (int k=al2.size()-1;k>=0;k--)
        {
            System.out.print(al2.get(k)+"  ");
        }
        //Task4 Assigning value of arr into Arraylist
        System.out.println("\n*********************Task4*************************");
        ArrayList<Integer>al3 = new ArrayList<Integer>();
        for (int o:arr)
        {
              al3.add(o);
        }
        return al3;
    }

    public static void main(String[] args)
    {
        Task1 tobj = new Task1();
       ArrayList<String>input1 = new ArrayList<>();
        input1.add("India");
        input1.add("Usa");
        input1.add("Japan");
        ArrayList<Integer>input2 = new ArrayList<>();
        input2.add(100);
        input2.add(200);
        input2.add(300);
         ArrayList<Integer> result =tobj.meth1(new int[]{11,22,33},input1,input2);
         for (Object o:result){
             System.out.print(o +" ");
         }

    }
}
