package OOPS.Abstraction.Abstract.Interface;

public interface InterfaceA {
    int x = 100;// public static final variable by default declared by compiler
    //static int y ;

   // void meth1();//public abstract method  meth1 by default compiler add public abstract we don't need
    // to write public abstract keyword in interface for any abstract method

    void meth2(String msg);

    String meth3(int x);

    //upto java 1.5v interfaces only allow abstract methods
    default void meth4()//from java 1.8v onward interface allows to write default method inside an interface
    {
        System.out.println("InterfaceA default Method ::");
    }

    static void meth5()//from java 1.8v onward interface allows to write static method inside an interface[and main method also]
    {
        System.out.println("InterfaceA static method ::");
    }
    default void meth1(){
        System.out.println("InterFaceA meth1() ::");
    }

    private void meth6()//from java 1.9v onward interface allows to write private method inside an interface
    {
        System.out.println("InterfaceA private Method ::");
    }

    public static void main(String[] args) {
        System.out.println("InterfaceA main()");
        InterfaceA.meth5();//we can call static method with the respective interface name no need to create object
        //InterfaceA aobj = new InterfaceA();//WE CANNOT CREATE OBJECT FOR INHERITANCE IT DOESN'T ALLOW
    }
}
