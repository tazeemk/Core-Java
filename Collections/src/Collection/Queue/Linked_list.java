package Collection.Queue;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list
{
    void meth1()
    {
        //If we are holding linkedlist object with linkedlist ref then can access both list and queue linkedlist futures
        //but If we are holding linkedlist object with list ref then can access only list interface linkedlist futures
        LinkedList<Object>ll= new LinkedList<Object>();
        ll.offer(10);//insertion order is Maintained
        ll.offer(null);//null value is allowed
        ll.offer("java");//heterogeneous data is allowed
        ll.offer(10);//duplicates is allowed
        ll.offer(5);//available from java 1.2v
        ll.offer('A');//default capacity is 0
        ll.offer(true);//its size increases by double
        ll.offer(2);//it is not synchronized
        System.out.println(ll);
        System.out.println("===========methods=========");
        //poll()-method remove first element and return first element
        System.out.println("\npoll() :"+ll.poll());
        System.out.println(ll);
        //peek()-method will return first element
        System.out.println("peek() :"+ll.peek());
        System.out.println(ll);
        //remove()-method will remove first element
        System.out.println("remove() :"+ll.remove());
        System.out.println(ll);
        System.out.println("\nRetrieving Data from LinkedList by using ListIterator InterFace");
        ListIterator<Object>i =ll.listIterator();
        while (i.hasNext())
        {
            System.out.print(i.next() +" ");
        }
    }

    public static void main(String[] args) {
        Linked_list obj = new Linked_list();
        obj.meth1();
    }
}
