package Practice;
import java.lang.*;
public class ClassA
{
  int amount ;
    public void m(){
        System.out.println("ClassA meth1()");
   // return this;
    }
    ClassA(int amount){
        this.amount=amount;
    }

    public static void main(String[] args) {
        String number = "66";
        ClassB b = new ClassB();
       // ClassA a = new ClassA();

     //   ClassC c = (ClassC) a;

    }
}
