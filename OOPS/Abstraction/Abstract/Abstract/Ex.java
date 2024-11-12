package OOPS.Abstraction.Abstract.Abstract;

public abstract class Ex
{
    abstract void Circle();
    static void meth(){
        System.out.println("Normal  static meth ::");
    }
    Ex(){
        System.out.println("Default Constructor Of Abstract Ex Class ::");
    }
    String name(){
     return "SANU";
    }
    abstract void msg();

    public static void main(String[] args) {
       // Ex obj = new Ex(); WE CANNOT CREATE OBJECT OF ABSTRACT CLASSES
        System.out.println("Main() Called ::");
        Ex.meth();
    }

}
