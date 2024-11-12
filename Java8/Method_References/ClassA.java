package Java8.Method_References;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collection;
public class ClassA
{
         int[] show( int arry[],TreeSet<Integer>ts)
       {
           Iterator<Integer>im = ts.iterator();
           System.out.println("\nValue in TreeSet :");
           while (im.hasNext())
           {
               System.out.print(im.next()+" ");
           }
           System.out.println("\nValue is array :"+Arrays.toString(arry));
           int array[]= new int[ts.size()];
           int m=0;
           Iterator<Integer>i = ts.iterator();
           while (i.hasNext())
           {
           array[m]=i.next();
           m++;
           }

           return array;
       }
    static void meg()
    {
        System.out.println("Static method Reference :");
    }
    ClassA()
    {
        System.out.println("Constructor Referencing  ::");
    }


    public static void main(String[] args)
    {

    }

}
