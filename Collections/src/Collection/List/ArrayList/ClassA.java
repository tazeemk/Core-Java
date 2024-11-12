package Collection.List.ArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClassA
{
    public void meth1()
    {
        //To restrict Heterogenous data and allow only homogenous data then use
        //generics with object of ArrayList
        List<Integer> al = new ArrayList<Integer>();
        List<Integer>a = new CopyOnWriteArrayList<Integer>();
        al.add(100);//Insertion order is maintained
        al.add(5000);//Heterogeneous  data is allowed
        al.add(222);//nulls are allowed
        al.add(300);//duplicates are allowed
        al.add(null);
       al.add(200);//It is available from java 1.2v
        al.add(330);//Its default capacity is 10
        al.add(200);//
        al.add(344);//It in not Synchronized
        System.out.println("al :"+al);
        ListIterator<Integer>l=al.listIterator();
        while (l.hasPrevious()){
            System.out.println(l.previous() +" ");
        }
        System.out.println("After reverse "+al);
        al.set(5,6);
        System.out.println("size() :"+al.size());
        //To retrieve element from particular index position the use==> element get(index)
        System.out.println("get() :"+al.get(2));
        System.out.println(" get() null :"+al.get(4));
        System.out.println("\n Retrieving data by using for loop :");
        for (int i=0;i<=al.size()-1;i++)//in forward direction
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println("\n\n Retrieving data in Backword direction by using for loop:");
        for (int i=al.size()-1;i>=0;i--)//in backword direction
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println("\n\n Retrieving Data by using for-each loop :");
        for (Object o:al)//for(Integer o:al) (or)  for(int o:al) //we can hold in Integer object ,or int data type automatically converted to integer object by compiler automatically
        {
            System.out.print(o +" ");
    }
        System.out.println("\n\nBefore al "+al);
        al.add(4,20033);
        System.out.println("After applying add() on al: "+al);
        System.out.println("\n\nBefore al "+al);
        al.set(5,12345);
        System.out.println("After applying set() on al: "+al);

        System.out.println("\n\n**************************************************");
        System.out.println("Retrieving Data by using Iterator Interface :");
        Iterator<Integer> i =al.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
            //al.add(55);Exception while iterating
        }
        System.out.println("\n\n*******************************************************");
        System.out.println("===========methods()============");
        ArrayList<Integer> al2= new ArrayList<Integer>();
        al2.add(100);
        al2.add(300);
        System.out.println("isEmpty() :"+al.isEmpty());
        System.out.println("Contains() :"+al.contains(100));
        System.out.println("ContainsAll() with object ::"+al.containsAll(al2));
        System.out.println("al :"+al);
      //  al.clear();
      //  System.out.println("isEmpty :"+al.isEmpty());
        System.out.println("\nAddAll() :"+al.addAll(al2));
        System.out.println(al);

        System.out.println("\nRemove() :"+al.remove(2));
        System.out.println("After removing with index position"+al);
        System.out.println("Remove Object :"+al.remove((Object)20033));
        System.out.println("After removing particular data 20033 :"+al);
        //removing al2 obj data from al obj
        System.out.println(al.removeAll(al2));
       // System.out.println(al);
        System.out.println(al2);

        System.out.println("\n retainAll() :"+al.retainAll(al2));
        System.out.println("after applying retain() :"+al2);
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

}
