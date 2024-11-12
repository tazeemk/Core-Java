package Practice;

public class Swaping
{
    public static void main(String[] args) {
        int a=10;
        int b=6;
        System.out.println("before swapping :"+a);
        System.out.println("before swapping :"+b);
        a =a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a :" +a);
        System.out.println("after swapping b :"+b);
    }
}
