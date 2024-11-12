package Collection.Set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task5
{
    public static void main(String[] args)
    {
        System.out.println("Finding highest and lowest element in TreeSet");
TreeSet<Integer>ts1=new TreeSet<>();
        TreeSet<Integer>t=new TreeSet<Integer>();
        t.add(20);
        t.add(10);
        t.add(5);
        t.add(50);
        t.add(20);

        System.out.println();
        for (int i:t){
            System.out.println("Lowest Element is :"+i);
            break;
        }
        Iterator<Integer>e = t.descendingIterator();
        while (e.hasNext()) {
            System.out.println("Highest Element is :" + e.next());
            break;
        }
        System.out.println( t.tailSet(20).first());

    }
}
