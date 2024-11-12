package OOPS.Abstraction.Abstract.Interface;

import OOPS.Abstraction.Abstract.Interface.Task.ClassC;

public class ClassB implements Functional,InterfaceC
{
    public void assign(){
        System.out.println("FUNCTIONAl INTERFACES :: ");
    }
    public void meth9(){

    }
    public InterfaceD meth(){

        return null;
    }
     static public  InterfaceC getReturn(){

        return new ClassB();
    }

    public static void main(String[] args) {
        InterfaceC co = new ClassB();
       // co = new ClassC();
        System.out.println(co);
    }
}
