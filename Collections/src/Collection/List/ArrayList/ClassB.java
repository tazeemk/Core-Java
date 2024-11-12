package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB
{
    public void ArrayListOperation(){
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Devang");//Insertion order in maintain
        obj.add("sanu");//Heterogeneous data is allowed
        obj.add(null);//null is allowed
        obj.add("sufiyan");//duplicate data is allowed
        obj.add("sahil");
        obj.add("sahid");//it is available from java 1.2v
        obj.add("sufiyan");//its default capacity is 10
        obj.add("sakib");//its size increases by half
        obj.add("siblu");//It is not synchronized
        obj.add("kuldeep");
        System.out.println("\nobj :"+obj);
        System.out.println("Size() :"+obj.size());
        System.out.println("get() :"+obj.get(2));
       // System.out.println("get() null :"+obj.get(2));
        obj.add(obj.size(),"pelandu");
        System.out.println(obj);
        System.out.println("\n\nRetrieving data by using for-loop :");
        for (int i=0;i<=obj.size()-1;i++)
        {
            System.out.print(obj.get(i)+" ");
        }
        System.out.println("\n\nRetrieving data by using for-each loop :");
        for (Object o:obj)
        {
            System.out.print(o+" ");
        }
        System.out.println("\n\nBefore add() :"+obj);
        obj.add(4,"mohd");//add method will not replace the element it just shift the old value to next index position and add new value at old value position
        System.out.println("After add() :"+obj);
        System.out.println("before set() :"+obj);
        obj.set(5,"Mohd Sahil");//set() replace old value with new value :
        System.out.println("After set() :"+obj);

        System.out.println("\nRetrieving data by using Iterator Interface :");
        Iterator<String> i= obj.iterator();
        while (i.hasNext()){
            System.out.print(i.next());
        }
        System.out.println("\n\n=======================Methods=======================");

        ArrayList<String>obj2 = new ArrayList<String>();
        obj2.add("Trimohan");
        obj2.add("shujeet");
        System.out.println("isEmpty() :"+obj.isEmpty());
        //obj.clear();
       // System.out.println("isEmpty ()"+obj.isEmpty());

        System.out.println("\n========Performing operations b/w two ArrayList OBJECTS =========");

        System.out.println("Contains() :"+obj.contains((Object)"sahid"));
        System.out.println("ContainsAll() :"+obj.containsAll(obj2));
        System.out.println("remove() :"+obj.remove(2));
        System.out.println("After removing :"+obj);
       // System.out.println("removeAll() :"+obj.removeAll(obj));
      //  System.out.println("After removeAll() :"+obj);
        System.out.println("retainAll() :"+obj.retainAll(obj2));
        System.out.println("After retailAll() :"+obj2);
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.ArrayListOperation();
    }
}
