package Collection.Set.TreeSet;

import java.util.TreeSet;

public class Task3
{
    void meth1(){
        System.out.println("Coping One TreeSet into Another TreeSet :");
        TreeSet<Integer>t = new TreeSet<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println("TreeSet1 :"+t);
        TreeSet<Integer>t2= new TreeSet<Integer>(t);
        System.out.println("TreeSet2 :"+t2);

    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.meth1();
    }
}
