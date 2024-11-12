package Collection.Map;

import java.security.KeyStore;
import java.util.*;
import java.util.Map;
public class Hash_Map
{
    void meth1()
    {
        HashMap<Object,Object>map = new HashMap<Object,Object>();
        map.put(101,"java");//Insertion order is not maintained
        map.put(null,null);//Heterogeneous keys are allowed   and heterogeneous values are allowed
        map.put('A',"python");//duplicate values are allowed
        map.put(103,"css");//null keys are allowed  and null values are allowed
        map.put(true,"java");//it is available fro java 1.2v
        map.put(109,null);//its default capacity is 16[load factor 0.75]
        map.put(102,"css");//its size increases by double
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
        LinkedHashSet<Object>ll=new LinkedHashSet<Object>(map.keySet());
        Iterator<Object>i = ll.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("\nRetrieving key and value pair data from map ");
          HashSet<Object>hm = new HashSet<Object>(map.entrySet());
          Iterator<Object>i1 = hm.iterator();
          while (i1.hasNext()){
            //  System.out.println(i1.next());
              Map.Entry e = (Map.Entry) i1.next();
              System.out.println(e.getKey()+" "+e.getValue());
          }
    }
    void meth2(){
        System.out.println("Passing User-Defined objects into HashMap :");
        Employee emp1 = new Employee("Devang",90323312,"Cheif General");
        Employee emp2 = new Employee("Sanu",  232233212," General");
        Employee emp3 = new Employee("sakib",3232312,"General Commander");
        Employee emp4 = new Employee("Sahid",32123," Major");
HashMap<Object,Employee>hm1= new HashMap<Object,Employee>();
        hm1.put(101,emp1);
        hm1.put(102,emp2);
        hm1.put(103,emp3);
        hm1.put(104,emp4);
      //  System.out.println("\n "+hm1);
        ArrayList<Object>al = new ArrayList<Object>(hm1.entrySet());
        Iterator<Object>i =al.iterator();
        System.out.println("EMPNO:EMPNAME :EMPSAL    : EMPDEPT ");
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

    public static void main(String[] args) {
Hash_Map hm = new Hash_Map();
//hm.meth1();
  hm.meth2();
    }

}
