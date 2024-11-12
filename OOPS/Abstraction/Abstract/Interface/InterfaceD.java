package OOPS.Abstraction.Abstract.Interface;

public interface InterfaceD
{
    int access();
    default void dis(){
        System.out.println("default method of interfaced ::");
    }
}
