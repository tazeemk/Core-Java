package Practic;

public class Fahad_1
{
    int  meth1(int a, int  b)
    {
        System.out.println("start");
        System.out.println(a);
        System.out.println(a-b);
        return new Fahad_1().meth4(a-1,"hii");
    }
    String meth2(int x )
    {
        System.out.println(x-new Fahad_1().meth1(200,199));
        System.out.println(x);
        return "java";

    }
    String meth3(int a , int b , String s)
    {
        System.out.println(a);
        System.out.println(a+a);
        System.out.println(a+b);
        return s;
    }
    int meth4(int a , String s)
    {
        System.out.println(a);
        System.out.println(s);
        return a+a;
    }
    String meth5(String s)
    {
        return s;
    }

    public static void main(String[] args)
    {
        System.out.println(new Fahad_1().meth5(new Fahad_1().meth3(15,25,new Fahad_1().meth2(500))));
    }
}
