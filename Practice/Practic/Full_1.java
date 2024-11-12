package Practic;

public class Full_1
{

    static int x=10;
    int y=30;
    void meth1()   // called by main
    {
        System.out.println("meth1() called");
        Full_1 obj1=new Full_1();
        System.out.println("staic var x is:"+Full_1.x);
        System.out.println("instance var y is "+obj1.y+"\n");
        obj1.meth2(100);
    }
    int meth2(int i)  // called by meth1()
    {
       int v1=10;
       int v2=20;
        System.out.println("sum ="+(v1+v2));
        System.out.println("multiplication ="+(v1*v2));
        System.out.println("substraction ="+(v2-v1));
        System.out.println("division ="+(v2/v1));
        return i=meth3("java is lovely"+"\n");
    }
    static int meth3(String S)   // called by meth2()  // static method
    {
        int x=50;
        Full_1 obj2=new Full_1();
        if(x>Full_1.x)
        {
            System.out.println("if block executed !!\n");
        }
        else
        {
            System.out.println("else block executed !!");
        }
        obj2.meth4();
         return x;
    }
    Full_1()
    {
        int i=1;
        int j=2;
        int sum=++i + j++;
        System.out.println("const sum="+sum);
        int mul=i++ * j++ * --i;
        System.out.println(" const mult="+mul+"\n");
    }
    Full_1(int z)
    {
        System.out.println("parameterized contsructor");
        int x1 = 12;
        byte x = (byte)x1;
        System.out.println("typecasting int to byte"+x);

        float f=12.00f;
        double d=f;
        System.out.println("float val :"+f);
        System.out.println("double val typecasted "+d+"\n");

    }
    static   // static block
    {
        System.out.println("static block executed after static var");
        Full_1 bobj=new Full_1(20);

    }
    public int meth4()
    {
        System.out.println("this meth4() is for autoboxing");

        int i=14;
        Integer x1= Integer.valueOf(i);    // 3rd way of autoboxing
        System.out.println("Integer wco x1 "+x1);

        char c='D';
        Character x2=Character.valueOf(c);   // 3rd way of autoboxing
        System.out.println("Character wco x2 "+x2);

        byte b=(byte)12;
        Byte x3=b;       // 1st way of autoboxing
        System.out.println("Byte wco x3 "+x3+"\n");

        System.out.println("performing auto unboxing");
         Integer val1=92;
         int s = Integer.valueOf(val1);
        System.out.println("obj value before autounboxing"+val1);
        System.out.println("int value afte autounboxing"+s);

        Byte b1=(byte)21 ;
        byte bb1 = Byte.valueOf(b1);
        System.out.println(" Byte obj of  autounboxing"+b1);
        System.out.println("byte value afte autounboxing"+bb1);


        return 10;

    }

    public static void main(String[] args)
    {
     Full_1  mobj=new Full_1();
        System.out.println("calling hashcode()"+mobj.hashCode());
        System.out.println("calling toString()"+mobj.toString());
        System.out.println("calling getClass() "+mobj.getClass());
        System.out.println("calling hashcode()"+mobj.equals(mobj));
       Full_1 mobj2= new Full_1(45);
       mobj.meth1();

    }
}
