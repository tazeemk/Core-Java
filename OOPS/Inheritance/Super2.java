package OOPS.Inheritance;

public class Super2 extends Super1
{
    int x=55;
    public void meth2()
    {
        System.out.println("Super2 Class method");
        System.out.println("Super1 Class Instance Variable x :"+super.x);
        meth1();
    }
    public void meth1(){
        System.out.println("Super2 Class meth1");
    }
    Super2(){

        super.meth1();
        this.meth2();
        meth1();
        System.out.println("Super2 Class Default Constructor ");

    }

    public static void main(String[] args) {
        Super2 sobj = new Super2();
        sobj.meth2();


    }
}
