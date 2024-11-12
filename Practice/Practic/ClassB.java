package Practic;

public class ClassB extends ClassA
{
    void meth1(){
        System.out.println("ClassB method :");
    }
    @Override
public void meth(){

        System.out.println("");
}

    public static void main(String[] args) {
        ClassA bobj = new ClassB();//
        //ClassA aobj = new ClassA();

    }

}
