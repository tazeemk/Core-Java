package OOPS.Encapsulation;

import java.util.Scanner;

public class Ex1
{
    public int  meth(){
        System.out.println("meth called ::");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x ::");
        Ex e = new Ex();
        e.setX(sc.nextInt());
        //System.out.println("value in x "+e.getX());
    return e.getX();
    }

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        System.out.println("value of x::"+ex.meth());
    }
}
