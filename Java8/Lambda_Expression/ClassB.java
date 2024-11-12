package Java8.Lambda_Expression;


public class ClassB
{
    void meth1(){
  // InterfaceD x=(int z)-> System.out.println(" z"+z);//1 st way

  // InterfaceD y=( m)-> System.out.println("z "+m);//2nd way datatype not declare
  // y.meth1(90);

   InterfaceD d = x-> System.out.println(" x"+x);//3rd way but only applicable for single argument

InterfaceB bobj =new ClassA()::meth2;
bobj.meth2(10,30);

    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
    }
}
