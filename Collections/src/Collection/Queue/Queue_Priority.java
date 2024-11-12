package Collection.Queue;

import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Queue_Priority
{
    void meth1()
    {
        PriorityQueue<Object>pq = new PriorityQueue<Object>();
        pq.add(20);//Insertion order is
        pq.add(10);//Heterogeneous data is not allowed
        pq.add(20);//duplicates are allowed
        //pq.add(null);//null values are not allowed
        pq.add(32);//available from java 1.5v
        pq.add(5);//default capacity is 11
        pq.add(23);//size increases by double
        pq.add(2);//it is not synchronized
        System.out.println(pq);
        System.out.println("=====methods=====");
        System.out.println("poll() :"+pq.poll());
        System.out.println(pq);
        System.out.println("remove() :"+pq.remove());
        System.out.println(pq);
        System.out.println("\nRetrieving data from PriorityQueue by using Iterator Interface :");
        Iterator<Object> i= pq.iterator();
        while (i.hasNext()){
            System.out.print(i.next() +" ");
        }
        System.out.println("\n\nRetrieving data from PriorityQueue by using for-each loop :");
        for (Object o:pq)
        {
            System.out.print(o +" ");
        }
        System.out.println("Sorting PriorityQueue elements in ascending order:");
        System.out.println("PriorityQueue :"+pq);
        System.out.println("Sorting "+new TreeSet<Object>(pq));



     //   pq.clear();
        //poll() -with empty Queue will return null
        /*System.out.println("poll() :"+pq.poll());
        System.out.println(pq);
        //remove()-with empty queue will return NoSuchElementException
        System.out.println("remove :"+pq.remove()); */
    }


    public static void main(String[] args) {
        Queue_Priority obj = new Queue_Priority();
        obj.meth1();
    }
}

