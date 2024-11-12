package Collection.Map;

import java.util.*;

public class Linked_Hash_Map
{
    void meth1()
    {
        LinkedHashMap<Object,Object> map = new LinkedHashMap<Object,Object>();
        map.put("sanu","java");//Insertion order is Maintained
        map.put(null,null);//Heterogeneous keys are allowed   and heterogeneous values are allowed
        map.put('A',"python");//duplicate values are allowed
        map.put(103,"css");//null keys are allowed  and null values are allowed
        map.put(true,"java");//it is available fro java 1.4v
        map.put(109,null);//its default capacity is 16[load factor 0.75]
        map.put(69,"Sahid");//its size increases by double
        map.put(104,'S');//it is not synchroniezed
        map.put("Gautam","java");
        System.out.println("\n"+map);
        System.out.println("get() :"+map.get(true));//it return given key value
        System.out.println("put() :"+map.put("Gautam","Pelandu"));//it replace given associated key  old value with the new value
        System.out.println("\n "+map);
        System.out.println("\nRetrieving keys from Hashmap by using ArrayList :");
//we cannot directly retrieve data from map implemented classes if we want to retrieve data from map classes we need to use
        //collection implemented classes:
        //ArrayList<Object> al=new ArrayList<Object>(map.keySet());//keySet()-method is used to return key values
        LinkedHashSet<Object> ll=new LinkedHashSet<Object>(map.keySet());
        Iterator<Object> i = ll.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("\nRetrieving key and value pair data from map ");
        HashSet<Object> hm = new HashSet<Object>(map.entrySet());
        Iterator<Object>i1 = hm.iterator();
        while (i1.hasNext()){
            //  System.out.println(i1.next());
            Map.Entry e = (Map.Entry) i1.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

    public static void main(String[] args) {
        Linked_Hash_Map hm = new Linked_Hash_Map();
        hm.meth1();
    }

}
