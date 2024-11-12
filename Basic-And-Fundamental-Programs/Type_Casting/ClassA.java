package Type_Casting;

import java.util.Scanner;

public class ClassA
{
    Scanner sc = new Scanner(System.in);
    void meth() {
        byte b = 6;
        int i = b;
        System.out.println("value of i "+i);
        char c ='a';
        int a = c;
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        char w =(char)n;
        System.out.println("value of w ::"+w);

        System.out.println("char of in int ::"+a);

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth();

    }
}
