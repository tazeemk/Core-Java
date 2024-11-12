package InnerClass;

public class OuterClass
{
    int x =6;
    int y=6;
    void Display(){
        System.out.println("Outer Class Display Method ::");
    }
    public void AccessInnerClass(){
        InnerClass inner = new InnerClass();
         inner.Msg();
    }
    public class InnerClass{
        int x;
        int y;
        static void mss(){
               class f{

               }
        };
        void Msg(){
            System.out.println("InnerClass Msg method ::");
            System.out.println(x);
        }
    }
}//Outer Class ends
