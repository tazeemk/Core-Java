package Collection.Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Hash_Table
{
    void meth1()
    {
        System.out.println("Implementing Hashtable ::");
        Hashtable<Object,Object>ht = new Hashtable<Object,Object>();
        ht.put(101,"java");//Insertion Order is not maintained
        ht.put(145,"hello");//null keys and values are not allowed
        ht.put(106,'A');//Duplicate values are allowed
        ht.put('W',"oracle");//heterogeneous keys and values are
        ht.put(true,"java");//available from java 1.0v [It legacy class]
        ht.put(false,5555);//its default capacity is 11
        ht.put(10,5);//its size increase by DOUBLE
        ht.put("java",102);//It is Synchronized

        System.out.println(ht+"\n");
        System.out.println("\nRetrieving data from hashtable by using Iterator interface:");
       Iterator<Object> i=new ArrayList<Object>(ht.entrySet()).iterator();
        while (i.hasNext()){
            //System.out.println(i.next());
            Map.Entry e= (Map.Entry)i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    void meth2()
    {
        Hashtable<Integer,Employee>ht = new Hashtable<Integer,Employee>();
        System.out.println("\nMeth2 called :");
        Employee emp1 = new Employee("Devang",23000,"sales");
        Employee emp2 = new Employee("sanu",63000,"marketing");
        Employee emp3 = new Employee("sahil",73000,"accounts");
ht.put(101,emp1);
ht.put(102,emp2);
ht.put(103,emp3);
        System.out.println(ht);
Iterator<Object>i = new ArrayList<Object>(ht.entrySet()).iterator();
while (i.hasNext()){
    System.out.println(i.next());
}
    }

    public static void main(String[] args) {
        Hash_Table h = new Hash_Table();
        h.meth1();
       // h.meth2();
    }
}
