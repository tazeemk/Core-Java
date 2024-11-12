package OOPS.Abstraction.Abstract.Abstract;

import java.util.Scanner;

public class Start
{

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Boot os = new OperatingSystem();
        System.out.println("Please Enter Your Preffered OS To Boot ::");
                 String  OSname =os.osName(sc.nextLine());
        System.out.println(OSname+" is Starting.........");
        Thread.sleep(5000);//Executing will stop for 5 sec
        System.out.println("........20%.........");
        Thread.sleep(5000);
        System.out.println("........50%.........");
        Thread.sleep(5000);
        System.out.println("........75%.........");
        Thread.sleep(5000);
        System.out.println("........100% loaded......");
        System.out.println("You Can Use Your OS ");
        sc.close();

    }
}
