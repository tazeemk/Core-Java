package This_keyword;

public class this_use4
{
    // this() is use to call constructor
    //it is used to call present class constructor
    //we need to use this() only inside constructor that to as a 1st statement if we are using this()
    // anywhere else we will getting C.E

    void meth1(){
        //this();  C.E we use it only inside the constructor
        System.out.println("meth1 called");
    }
    public this_use4()
    {
        this("java is awesome");
        this.meth1();
        System.out.println("default constructor");
        //this();//C.E because Call to 'this()' must be first statement in constructor body
    }
    public this_use4(String s){
        System.out.println("parameterized constructor "+s);
    }

    public static void main(String[] args) {
        new this_use4();
    }

}
