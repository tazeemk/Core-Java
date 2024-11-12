package Access_Modifiers;
import Access_Modifiers.ClassA;



    public class ClassB {
        public void meth2()
        {
            System.out.println("Class b method :");
        }

        public static void main(String[] args)
        {
            ClassA aobj = new ClassA();
            aobj.meth1();
            ClassB bobj = new ClassB();
            bobj.meth2();

        }
    }


