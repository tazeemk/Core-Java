package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTime
{
    private static Object arr[];
    static {
        arr=new Object[100000];
        //Using for loop passing 100000 objects into arr
        for (int i=0;i<= arr.length-1;i++)
        {
        arr[i]=new Object();
        }
    }
    void ArrayList_Time()
    {
        ArrayList<Object>al = new ArrayList<Object>();
        double start;
        double end;
        start=System.currentTimeMillis();
        for (Object o:arr){
            al.add(o);

        }
        end=System.currentTimeMillis();
        System.out.println("ArrayList Construction Time :"+(end-start));
    }
    void LinkedList_Time()
    {
        LinkedList<Object> lobj = new LinkedList<Object>();
        double start,end;
        start=System.currentTimeMillis();
        for (Object m:arr){
            lobj.add(m);
           // lobj.remove();
        }
        end=System.currentTimeMillis();
        System.out.println("LinkedList Construction Time :"+(end-start));
    }
    void meth(){
        for (Object s :arr){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        LinkedListTime llt = new LinkedListTime();
       llt.ArrayList_Time();
       llt.LinkedList_Time();
         //llt.meth();
    }
}
