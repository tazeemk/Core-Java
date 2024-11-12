package Collection.List.ArrayList;

import java.util.ArrayList;

public class ClassC
{
    public void meth1(){
        ArrayList al = new ArrayList();
        al.add(1000);//insertion order is maintain
        al.add(30);//heterogeneous data allowed
        al.add(20 );//duplicates are allowed
        al.add("awesome");//nulls are allowed
        al.add(1000);//Availability from java 1.2v
        al.add(20);
        al.add(90);
        al.add(100);
        al.add(1233);//
        System.out.println(al);
        System.out.println(al.get(2));
        al.add(3,"devang");
        System.out.println(al);
        al.set(4,"handsome");
        System.out.println(al);
        for (int i=0;i<=al.size()-1;i++)
        {
            System.out.print(al.get(i));
        }

        //al.contains()

    }

    public static void main(String[] args) {
        ClassC cobj = new ClassC();
        cobj.meth1();

    }
}
