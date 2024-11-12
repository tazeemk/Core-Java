package Collection.Set.TreeSet;

import java.util.*;

public class ClassA
{
    void meth1(){
        TreeSet<Object>ts = new TreeSet<Object>();
        ts.add(30);//Insertion order is not maintained is it insert elements in sort(ascending order)
        ts.add(40);//Heterogeneous data is not allowed
       // ts.add(null);//null is not allowed
        ts.add(60);//available from java 1.two v
        ts.add(10);//default size is 16[load factor 0.75]
        ts.add(20);//duplicate are not allowed
        ts.add(10);//size increases by double
        ts.add(50);//it is not synchronized
        ts.add(5);
        System.out.println("TreeSet :"+ts);
        System.out.println("size() :"+ts.size());
        System.out.println("\nRetrieving elements in ascending order from TreeSet:");
        Iterator<Object>i = ts.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println("\n\nRetrieving Elements in descending order from TreeSet:");
        Iterator<Object> i1 = ts.descendingIterator();
        while (i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println("\n\nImportant method of TreeSet :");
        System.out.println("headSet() :"+ts.headSet(40));//return all element which is before the given element as parameter
        System.out.println("tailSet() :"+ts.tailSet(40));//it return all element after the element including element which is given as parameter
        System.out.println("\n++++++++Passing ArrayList into TreeSet++++++++");
        ArrayList<Object>al = new ArrayList<Object>();
        al.add(10);
        al.add(10);
        al.add(20);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println("ArrayList :"+al);
        System.out.println("ArrayList :"+al.size());
        TreeSet<Object>ts1=new TreeSet<Object>(al);
        System.out.println("TreeSet :"+ts1);
        System.out.println("TreeSet :"+ts1.size());
    }
    void meth2(){
        System.out.println("Implementing User-Defined Objects in TreeSet :");
        Employee2 emp1 = new Employee2("devang",100);
        Employee2 emp2 = new Employee2("ahil",300);
        Employee2 emp3 = new Employee2("banu",200);
        Employee2 emp4 = new Employee2("banu",200);

        TreeSet<Employee2>ts2 = new TreeSet<>(new Comparator().reversed());
         ts2.add(emp1);
         ts2.add(emp2);
         ts2.add(emp3);
         ts2.add(emp4);

        Iterator<Employee2>i = ts2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }



    public static void main(String[] args) {
        ClassA aobj = new ClassA();
       // aobj.meth1();
        aobj.meth2();
    }
}
