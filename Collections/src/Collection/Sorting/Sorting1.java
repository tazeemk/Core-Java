package Collection.Sorting;

import java.util.*;

public class Sorting1
{
    void meth1()
    {
        System.out.println("=============COMPARABLE INTERFACE ===============");
        System.out.println("Sorting user Define objects in collection implemented classes:");
        LinkedList<Employee5> obj = new LinkedList<Employee5>();
        Employee5 emp1 = new Employee5("Devang",30200,"java");
        Employee5 emp2 = new Employee5("sanu",123200,"oracle");
        Employee5 emp3 = new Employee5("shaid",200,"Aws");
        Employee5 emp4 = new Employee5("sahi",3200,"Spring");
        obj.add(emp1);
        obj.add(emp2);
        obj.add(emp3);
        obj.add(emp4);
        System.out.println("Before Sorting "+obj);

        Collections.sort(obj);//by using comparable interface


        System.out.println("\nSorting by using comparable interface ::");
        System.out.println("\nAfter Sorting "+obj);
        Iterator<Employee5>i=obj.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
    void meth3(){
        System.out.println("=============COMPARATOR INTERFACE =============\n");
        System.out.println("================SORTING==============");
        ArrayList<Employee4> al = new ArrayList<Employee4>();
        Employee4 emp1 = new Employee4("abc","devang",1234);
        Employee4 emp2 = new Employee4("xyz","sahil",9900);
        Employee4 emp3 = new Employee4("mno","sanu",7788);
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
        System.out.println("Before Sorting "+al);
        Collections.sort( al,new ClassA());
        System.out.println("After Sorting :");
        Iterator<Employee4>i = al.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        Sorting1 s = new Sorting1();
        //s.meth1();
        s.meth3();
    }
}
