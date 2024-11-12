package Garbage_Collection;

public class ClassA
{
    public void meth1(){
        System.out.println("Meth1() Called :");
        ClassA obj = new ClassA();//inside method objects will be destroyed by gc
                         //when  method execution completed
    }
    @Override
    protected void finalize()
    {
        System.out.println("Garbage Has Been Collected ::");
    }

    public static void main(String[] args) {
        ClassA aobj1 = new ClassA();
        ClassA aobj2 = new ClassA();
        aobj1.meth1();
        System.out.println("aobj :"+aobj1.hashCode());
        System.out.println("aobj1 :"+aobj2.hashCode());
        //aobj1=aobj2;//Re-Assigning reference-variable Here both references pointing to aobj1(ClassA) OBJECT so aobj(ClassA)
                   //object is un refrenced object

        //aobj1=null; //Nullifying reference variable
        System.gc();//CALLING GC THROUGH SYSTEM CLASS MANUALLY
        //System.out.println(" aobj : "+aobj1.hashCode());
        //System.out.println("aobj1 : "+aobj2.hashCode());

    }
}
