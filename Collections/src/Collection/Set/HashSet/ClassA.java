package Collection.Set.HashSet;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClassA
{
    void meth1(){
        HashSet<Object>set = new HashSet<Object>();
        set.add(20);//Insertion order is Not Maintained
        set.add(30);//Heterogeneous data is Allowed
        set.add("java");
        set.add(null);//Null is allowed
        set.add(20);//Duplicate data are not Allowed
        set.add('A');//Available from java 1.2v
        set.add(true);//Default size is 16[load factor 0.75]
        set.add(50);//Size increases by Double
        set.add(40);//Its Not Synchronized
        //Collections.reverse(set);
        System.out.println("HashSet :"+set);
        System.out.println("size() :"+set.size());
       // System.out.println("get() :"+set.get(0));Not allowed bc Data store in hash value not index position
        //We cannot Retrieve data by using for loop because set Implemented classes
        //not store through index position it store by hash value
        System.out.println("\n Retrieving data from Hashset by using for-each loop :");
        for (Object o:set)
        {
            System.out.print(o +" ");
        }
        System.out.println("\n\nRetrieving Data in Reverse order by using ListIterator InterFace :");
        ListIterator<Object> i= new ArrayList<Object>(set).listIterator(set.size());//we cannot use listIterator in set implemented classes
        //because ListIterator is only allow for "List" implemented class
        while (i.hasPrevious())
        {
            System.out.print(i.previous() +" ");
        }
        System.out.println("\n\n+++++++++++++++++Passing HashSet Into ArrayList++++++++++++++++++");
        ArrayList<Object>al = new ArrayList<Object>(set);
        System.out.println("ArrayList :"+al);
        System.out.println("HashSet :"+set);
        System.out.println("\n+++++++++++++Passing ArrayList into HashSet+++++++++++++++++++");
        ArrayList<String>countryName = new ArrayList<String>();
        countryName.add("india");
        countryName.add("india");
        countryName.add("india");
        countryName.add("india");
        countryName.add("Russia");
        System.out.println("HashSet :"+new HashSet<String>(countryName));
        System.out.println("ArrayList :"+countryName);


    }
    void meth2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nImplementing User-Defined objects into HashSet :");
        Employee1 emp1 = new Employee1("Devang",900000,10);
        Employee1 emp2 = new Employee1("anu",40000,40);
        Employee1 emp3 = new Employee1("lahid",3000,30);
        Employee1 emp4 = new Employee1("Sahil",12000,20);
      //  System.out.println("Please Enter name,sal,deptno of the employee");
    //    Employee1 emp5 = new Employee1(sc.next(),sc.nextDouble(),sc.nextInt());
        Set<Employee1>hs = new HashSet<Employee1>();
        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp3);
        hs.add(emp4);
        System.out.println("Employee Details Are :");
       // Iterator<Employee1>i = hs.iterator();
        TreeSet<Employee1>t1 = new TreeSet<Employee1>(hs);
         Iterator<Employee1>t=t1.iterator();
        while (t.hasNext())
        {
            System.out.println(t.next());

        }
        System.out.println("size() :"+hs.size());

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
     //   aobj.meth1();
          aobj.meth2();
    }

}
