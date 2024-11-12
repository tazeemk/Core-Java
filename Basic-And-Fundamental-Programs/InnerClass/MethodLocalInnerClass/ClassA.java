package InnerClass.MethodLocalInnerClass;

public class ClassA
{
    void meth1(){
        System.out.println("Implementing Method Local Inner Class :\n");
    class ClassB{

        void show(){
            System.out.println("Local InnerClass Method show() :");
        }
        int add(int x,int y){
            System.out.println("Method LocalInner Class add():\n");
            return x*y;
        }
        static void msg(){
            System.out.println("\nstatic method of method local inner class :");
        }
    }ClassB sho=new ClassB();
        System.out.println(sho.add(23,32));
    sho.show();
      ClassB.msg();


    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }
}
