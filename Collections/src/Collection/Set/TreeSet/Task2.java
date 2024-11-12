package Collection.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Task2
{
    void meth1(){
        System.out.println("TreeSet of String :");
        TreeSet<String>t = new TreeSet<String>();
        t.add("apple");
        t.add("banana");
        t.add("cherry");
        t.add("dates");
        t.add("elderberry");
    Iterator<String>i = t.descendingIterator();
    while (i.hasNext()){
        System.out.println(i.next());
    }
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.meth1();
    }
}
