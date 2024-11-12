package OOPS.Abstraction.Abstract.Abstract;

public class Ex1 extends Ex {
    void Circle() {
        System.out.println("Override Abstract Method From Abstract Class Ex ::");
    }
    void msg(){
        System.out.println("hello java");
    }

    public static void main(String[] args) {
        Ex eobj = new Ex1();
        System.out.println(eobj.name());
        eobj.Circle();
        eobj.msg();
    }
}
