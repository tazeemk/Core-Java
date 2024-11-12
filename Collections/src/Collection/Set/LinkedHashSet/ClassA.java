package Collection.Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class ClassA
{
    void meth1(){
        System.out.println("Implementing LinkedHashSet :");
        LinkedHashSet<Object>lhs=new LinkedHashSet<Object>();
        lhs.add(10);//Insertion order is maintained
        lhs.add("java");//heterogeneous data is allowed
        lhs.add(10);//duplicate data not allowed
        lhs.add(null);//null is allowed
        lhs.add('A');//available from java 1.4[load factor 0.75]
        lhs.add(30);//default capacity is 16
        lhs.add(true);//size increases by double
        lhs.add(40.0);//It is not synchronized
        lhs.add(5);
        System.out.println("LinkedHashSet :"+lhs);
        System.out.println("size() : "+lhs.size());
        System.out.println("Retrieving data from LinkedHashset by using for ListIterator");
        ListIterator<Object>li = new ArrayList<>(lhs).listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next() +" ");
        }
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

}
