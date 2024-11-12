package Collection.Map;

import java.util.*;

public class Tree_Map
{
    void meth1(){
        System.out.println("Implementing TreeMap :");
        TreeMap<Object,Object> tm = new TreeMap<Object,Object>();
        tm.put(106,"pelandu");//insertion order is not maintained key will be sorted in asc order
        tm.put(101,"java");//heterogeneous key are not allowed but heterogeneous values are allowed
        tm.put(102,null);//null keys are not allowed but null values are allowed
        tm.put(109,"smarty");//duplicate keys are not allowed but duplicate values are allowed
        tm.put(108,"python");//it is available from java 1.2v
        tm.put(786,"badshah");//its default capacity is 16[load factor 0.75]
        tm.put(103,"Apple");//its size increases by double
        tm.put(104,false);//it is not synchronized
        tm.put(69,"faiz lega");
        tm.put(104,"siva kumar F");
        System.out.println("\n"+tm);
        System.out.println("get() :"+tm.get(104));
        System.out.println("put() :"+tm.put(104,"siva kumar worst teacher"));
        System.out.println("\n"+tm);
        System.out.println("\nRetrieving key from TreeMap :");
        LinkedList<Object>ll= new LinkedList<>(tm.entrySet());
        Iterator<Object>i= ll.iterator();
        while (i.hasNext()){
            //System.out.println(i.next());
            Map.Entry e = (Map.Entry) i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("\nRetrieving keys and values in descending order from Tree_map by using Tree_set");
        TreeSet<Object>ts = new TreeSet<Object>(tm.keySet());
        Iterator<Object>i1 = ts.descendingIterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }

    public static void main(String[] args) {
        Tree_Map obj = new Tree_Map();
        obj.meth1();
    }
}
