package InnerClass.AnonymousInnerClass;

public class ClassA
{
    void meth1(){
        System.out.println("Implementing Anonymous InnerClass :");
        System.out.println("java is awesome :");
    }
    int meth2(int x,int y)
    {
        System.out.println("Meth2() performing division Operation:");
        return x/y;
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA(){

            @Override
            void meth1(){
                System.out.println("java is amazing :");
                super.meth1();
            }
            @Override
            int meth2(int x,int y)
            {
                System.out.println("Override method :");
             return x+y;   
            }

        } ;aobj.meth1();
        System.out.println(aobj.meth2(32,30));;
    }
}
