package InnerClass;

public class Nestest
{
    void meth1(){
        System.out.println("Outer class meth1()");
    }
    static {
        System.out.println("Outer Class Static Block :");
    }
    {
        System.out.println("Outer Class Instance Block");
    }
    Nestest(){
        System.out.println("Outer Class Constructor :");
    }
   public class NestestInnerClass
    {
        void msg(){
            System.out.println("NestedInnerClass  Method:");
        }
        static {
            System.out.println("Nested Static Block :");
        }
        NestestInnerClass(){
            System.out.println("NestedInnerClass Constructor :");
        }
        {
            System.out.println("NestedInnerClass Instance block :");
        }
    }

    public static void main(String[] args) {
        System.out.println(" Outer Class Main() : ");
     //   new Nestest().meth1();
        Nestest.NestestInnerClass aobj=new Nestest().new NestestInnerClass();
         aobj.msg();
    }
}
