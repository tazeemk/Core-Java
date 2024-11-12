package Access_Modifiers;
import Access_Modifiers.ClassB;
import Array_Prog.Assignment1;


public  class ClassA
{
        protected void meth1()
        {
            System.out.println("CLASS A METHOD::");
        }

        public static void main(String[] args) {
            ClassA aobj = new ClassA();
            aobj.meth1();
            ClassB b = new ClassB();
            b.meth2();
          //  Assignment1 as = new Assignment1();
        }
    }

