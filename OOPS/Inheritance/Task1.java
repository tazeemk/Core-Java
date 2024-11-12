package OOPS.Inheritance;

import This_keyword.Task;

public class Task1
{
   private void meth1(){
        System.out.println("Task1 meth1()");
    }
    void meth2(){
        System.out.println("Task1 meth2()");
    }
    Task1(){
        System.out.println("default constructor of parent class ::");
    }
}
class Test extends  Task1
{
 private void meth1(){
     System.out.println("meth override");
 }

    void Test1(){
        System.out.println("Test1 method ::");
    }
    public static void main(String[] args) {
        Task1 tobj = new Test();
        //tobj.meth1();
        //tobj.Test1();
        tobj.meth2();
        Test to = new Test();
        to.meth1();
    }

}

