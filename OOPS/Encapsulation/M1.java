package OOPS.Encapsulation;

import java.util.Scanner;

public class M1
{
    void emp(){
        Scanner sc = new Scanner(System.in);
        M obj = new M();

        System.out.println("ENTER YOUR NAME::");
        obj.setEmpName(sc.next());
        System.out.println("ENTER YOU EXPERIENCE::");
        obj.setEmpExp(sc.nextInt());
        System.out.println("ENTER YOUR SALARY::");
        obj.setEmpSal(sc.nextInt());

        System.out.println("Employee Details are::\n");
        System.out.println("Employee Name :" +obj.getEmpName());
        System.out.println("Employee Experience :"+obj.getEmpExp());
        System.out.println("Employee Salary :"+obj.getEmpSal());
        sc.close();
    }

    public static void main(String[] args) {
        M1 mobj = new M1();
        mobj.emp();
    }
}
