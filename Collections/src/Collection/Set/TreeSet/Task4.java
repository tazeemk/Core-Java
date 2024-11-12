package Collection.Set.TreeSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Task4
{
    public static void main(String[] args)
    {
        System.out.println("Converting TreeSet into Array :");
        TreeSet<Integer>t = new TreeSet<Integer>();
        t.add(10);
        t.add(20);
        t.add(15);
        t.add(5);
        t.add(2);
        Object arr[] =t.toArray();

       // arr.clone();
      //  Iterator<Integer>i =t.iterator()

        System.out.println("Array "+Arrays.toString(arr));
    }
}
