package OOPS.Abstraction.Abstract.Interface;

public interface Functional
{
    void meth9();
    default void assign(){
        System.out.println("Default method of Functional Interface ::");
    }
}
