package OOPS.Abstraction.Abstract.Interface;

import java.util.Map;

public class ClassA implements InterfaceA,InterfaceB
{
    @Override
    public void meth1() {

        System.out.println(" overridden meth1() ::");
        InterfaceA.super.meth1();
        InterfaceB.super.meth1();

    }

    @Override
    public void meth2(String msg)
    {
        System.out.println("InterfaceA meth2() overridden ::");
    }

    @Override
    public String meth3(int x)
    {
        return "InterfaceA meth3() overridden ::";
    }

    @Override
    public void meth4() {
        System.out.println("InterfaceB meth4() Overridden ::");
    }


    public static void main(String[] args) {
        //InterfaceA aobj = new ClassA();
       // aobj.meth1();
        //aobj.meth2("java is awesome ::");
        //System.out.println(aobj.meth3(23));
        //aobj.meth4();
       // InterfaceB bobj = new ClassA();
        //bobj.meth4();
        //bobj.meth1();
        ClassA a = new ClassA();
        a.meth1();
        InterfaceA ao = new ClassA();
           // ao = new ClassB();
    }
}
