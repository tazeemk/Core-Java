package Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Task1
{
    void meth1(){
        System.out.println("Creating tree set and inserting data :");
        TreeSet<Integer>t = new TreeSet<>(Comparator.reverseOrder());
        t.add(10);
        t.add(5);
        t.add(30);
        t.add(20);
        t.add(25);
        System.out.println("TreeSet "+t);
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.meth1();
    }
}
