package Collection.List.LinkedList;

import java.util.*;

public class ClassA
{
    void meth1()
    {
        System.out.println("IMPLEMENTING LINKEDLIST :");
        LinkedList<Object>ll = new LinkedList<Object>();
        ll.add(10);//insertion order is maintain
        ll.add("java");//Heterogeneous Data is allowed
        ll.add("is");//it is not synchronized
        ll.add(10);//Duplicate are allowed
        ll.add(null);//null is allowed
        ll.add(200);//It is available from java 1.2v
        ll.add(300);//its default capacity is 0
        ll.add(2000);//its size increases by double
        System.out.println("LinkedList :"+ll);
        System.out.println("size "+ll.size());
        Collections.swap(ll,5,6);
        System.out.println(ll.indexOf(200));
        System.out.println("\nRetrieving Data in both direction by using ListIterator :");
        //Retrive last element from linked list
        System.out.println("last element"+ll.getLast());
        ListIterator<Object>li1 =ll.listIterator();
        while (li1.hasNext())
        {
            System.out.print(li1.next() +" ");
        }
        System.out.println();
        while (li1.hasPrevious()){
            System.out.print(li1.previous() +" ");
        }
        System.out.println("\n\nRetrieving data by using iterator :");
        Iterator<Object>li2 = ll.iterator();
        while (li2.hasNext()){
            System.out.print(li2.next()+" ");
        }
        System.out.println("\n\nRetrieving data by using Enumeration interface :C.E");
       ArrayList<Object>aa = new ArrayList<Object>(ll);
        Vector<Object>v = new Vector<>(ll);
        //Enumeration<Object>e =ll.elements(); C.E
        System.out.print("ArrayList :"+aa);
        System.out.print("\nVector :"+v);
        System.out.println("\n\n************************Methods********************************");
        LinkedList<Object>ll2 = new LinkedList<Object>();
        ll.add("java");
        ll2.addAll(ll);
        System.out.println("addAll() :"+ll2);
        System.out.println("containsAll() :"+ ll.containsAll(ll2));
        System.out.println("getFirst() :"+ll.getFirst());
        System.out.println("getLast() :"+ll.getLast());
        System.out.println("removeFirst() :"+ll.removeFirst());
        System.out.println(ll);
        ll.addFirst(10);
        ll.addLast("End :");
        System.out.println("\nLinkedList :"+ll);

    }
    void meth2(){
        System.out.println("\n======Adding User-defined class Object into LinkedList===== :");
        Employee emp1 = new Employee("john",10000);
        Employee emp2 = new Employee("devang",20000);
        Employee emp3 = new Employee("sanu",340000);
        Employee emp4 = new Employee("alex",120000);
        Employee emp5 = new Employee("martin",30000);
        LinkedList<Employee>ep = new LinkedList<Employee>();
        ep.add(emp1);
        ep.add(emp2);
        ep.add(emp3);
        ep.add(emp4);
        ep.add(emp5);
        System.out.println("\nRetrieving Employee Data in Reverse Order by using ListIterator :");
       ListIterator<Employee>l = ep.listIterator(ep.size());
       while (l.hasPrevious())
       {
           System.out.print(l.previous()+" ");
       }

    }

    public static void main(String[] args)
    {
        ClassA aobj = new ClassA();
        aobj.meth1();
      //  aobj.meth2();
    }
}
