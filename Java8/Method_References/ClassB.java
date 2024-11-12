package Java8.Method_References;

import java.util.Arrays;
import java.util.TreeSet;

public class ClassB
{
    void Display(){
        System.out.println("Implementing Method References :");
//in place of implementing body for method we just refer
        //alerady implemented method from any class to our
        //Interface method just by using method referencing
        InterfaceB bobj =ClassA::meg;//static method referencing
        bobj.meth2();
        InterfaceA aobj=new ClassA()::show;//non-static method referencing

        TreeSet<Integer>ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(70);
        ts.add(80);
        ts.add(50);
        ts.add(20);
      int result []=aobj.meth1(new int[]{99,88,77,66},ts);
        System.out.println("Meth1 is returning :"+ Arrays.toString(result));

     InterfaceB b =  ClassA::new;//Constructor Referencing
         b.meth2();
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.Display();
    }
}
