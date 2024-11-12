package Practice;

public class Class_1
{
    int c;
    static int e;
    Class_1()
    {
        System.out.println(++c);
        System.out.println(++e);
    }

    public static void main(String[] args)
    {
        int a=34;
        int b=21;
        new Class_1().c=a++  + ++b;
        int d= --a  + --b  + new Class_1().c--;
        e= a+   +b  +  +new Class_1().c +d--;
        int f= -a + b--  + -new Class_1().c -d++;
        int sum= a+b + new Class_1().c +d+e+f;
        System.out.println("sum+"+sum);
    }
}
