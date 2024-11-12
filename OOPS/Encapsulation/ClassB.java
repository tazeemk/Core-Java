package OOPS.Encapsulation;

import java.util.Scanner;

public class ClassB
{

public void meth()
{
     Scanner sc = new Scanner(System.in);
        ClassA aobj = new ClassA();
    System.out.println("ENTER YOUR NAME::");
        aobj.setEmpName(sc.next());
    System.out.println("ENTER YOUR ID::");
    aobj.setEmpId(sc.nextInt());
    System.out.println("ENTER YOUR AGE ::");
    aobj.setEmpAge(sc.nextInt());
    System.out.println("ENTER YOUR DEPARTMENT ::");
    aobj.setEmpDept(sc.next());


    System.out.println(" Employee Details Are \n");
    System.out.println("Employee Name : "+aobj.getEmpName());
    System.out.println("Employee Id : "+aobj.getEmpId());

    if (aobj.getEmpAge()>=100)
    {
        System.out.println("EMPLOYEE AGE : INVALID AGE ");

    }else {
        aobj.setEmpAge(sc.nextInt());
    }


   // System.out.println("Employee Age : "+aobj.getEmpAge());
    System.out.println("Employee Dept : "+aobj.getEmpDept());
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth();
    }

}
