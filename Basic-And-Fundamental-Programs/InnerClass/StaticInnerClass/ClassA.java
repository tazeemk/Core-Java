package InnerClass.StaticInnerClass;

public class ClassA
{
    int x=10;
    static int y=20;

    static {
        System.out.println("OuterClass static Block :");
    }
    ClassA(){
        System.out.println("OuterClass Constructor :");
    }
    static class InnerClassA
    {
    void display(){
        System.out.println("StaticInnerClass ");
        System.out.println("Instance Variable "+new ClassA().x);
        System.out.println("Static Variable :"+y);
    }
    static {
        System.out.println("Instance Block of Static InnerClassA :");

    }

        public static void main(String[] args) {
            new InnerClassA().display();
        }

    }

    public static void main(String[] args)
    {
        ClassA.InnerClassA bobj = new ClassA.InnerClassA();
        bobj.display();

    }
}
