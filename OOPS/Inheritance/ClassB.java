package OOPS.Inheritance;

public class ClassB extends ClassA
{
    @Override
    public void Display(){
        System.out.println("overridding display method");
    }
    void met(){

        System.out.println("classB met");
    }
    static void m(){

        System.out.println("static method of classB ::");
    }


public static void t(){

    System.out.println("overridden static method ");
}
ClassB(int x){

    System.out.println("ClassB parameterized constrctor ::"+x);
}
//public void X(){
  //  System.out.println("Overridding classA x method");
//}


    public static void main(String[] args) {
        ClassB bobj = new ClassB(6);
       // bobj.meth2();
        //bobj.meth1();
        ClassA aobj = new ClassB(6);
      //  ClassB  obj =(ClassB) aobj;
       // aobj.meth1();
     //  aobj.m();
        //obj.m();
       // bobj.meth2();
        //m();
        //t();
        aobj.me();
     bobj.met();
    // aobj.X();
     aobj.me();
        //aobj.Display();
    }
}
