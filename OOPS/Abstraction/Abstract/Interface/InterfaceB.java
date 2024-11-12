package OOPS.Abstraction.Abstract.Interface;

public interface InterfaceB
{
void meth4();
static void meth6(){
    System.out.println("InterfaceB static method::");
}
default void meth1(){
    System.out.println("InterFaceB meth1() ::");
}
}
