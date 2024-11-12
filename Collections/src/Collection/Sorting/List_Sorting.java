package Collection.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class List_Sorting
{
    void meth1(){
        ArrayList<Integer>i= new ArrayList<Integer>();
        i.add(50);
        i.add(5);
        i.add(10);
        i.add(90);
        i.add(150);
        i.add(80);
        i.add(4);
        i.add(79);
        System.out.println("Before Sorting :"+i);
        Collections.sort(i);//Collections class sort method is only applicable for list implemented classes
        System.out.println("After Sorting :"+i);
        System.out.println("\nIterator");
        Iterator<Integer> i1 = i.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }



    public static void main(String[] args) {
        List_Sorting ls = new List_Sorting();
        ls.meth1();
    }

}
