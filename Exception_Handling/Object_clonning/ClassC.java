package Exception_Handling.Object_clonning;

public class ClassC implements Cloneable
{
    int a;
    int b;
    void meth5(){
        System.out.println("CLASSC MRTHOD ::");
    }
    //THIS METHOD IS RETURNING OBJECT FOR CLASSC
    public ClassC Create() throws Exception
    {
        return (ClassC) super.clone();
    }

    public static void main(String[] args)throws Exception
    {
        ClassB bobj = new ClassB();
        System.out.println(" x  :"+bobj.x +" "+" y :"+bobj.y);
        //ClassC b = .Create();
        //Here clonning() of classB returning method to classB
        ClassB bobj1 = bobj.clonning();
        System.out.println(bobj);
        bobj1.y=6666555;
        System.out.println(bobj1.x+ bobj1.y);
        System.out.println();
        }
    }

