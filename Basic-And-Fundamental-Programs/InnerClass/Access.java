package InnerClass;

public class Access
{
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        //o.AccessInnerClass();//First way
        //OuterClass.InnerClass i = o.new InnerClass();//Way to create inner class Object
        //i.Msg();
       // System.out.println("Outer class object location ::"+o);
      //  System.out.println("InnerClass object location ::"+i);

        //Creating Object Static inner class
        Outer.inner ai = new Outer.inner();
        ai.Inner();
        Outer.inner.Inner();
        OuterClass.InnerClass.mss();

    }
}
