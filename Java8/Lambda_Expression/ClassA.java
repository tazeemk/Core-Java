package Java8.Lambda_Expression;

public class ClassA
{
    void meth1()
    {

        //through lambda expression we can instantiated functional interface(abstract methods) without overriding
        System.out.println("IMPLEMENTING LAMBDA EXPRESSION :");
        InterfaceA x=()-> System.out.println("Hello ");  //lambda expression without parameter
      x.meth1();

      InterfaceB y=(int a,int b)-> // with parameter :
      {
          System.out.println("Addition "+a+b);
      };
      y.meth2(10,30);

      InterfaceC z=(int m,int n)->{
          if (m>n)
          {
              System.out.println("If block executed :");
              msg1();
              return 100+m;
          }else {
              System.out.println("Else block executed:");
              msg2();
              return 500+n;
          }
      };
        System.out.println(z.meth3(80,900));

    }
    void msg1(){
        System.out.println("java is awesome :");
    }
    void msg2(){
        System.out.println("java is amazing :");
    }
  void meth2(int number1,int number2)
  {
      System.out.println("Lambda Expression required to provide Implementation of existing method " +
              "then we use method references : ");
      System.out.println("Method References: ");
      System.out.println("Value of number1 :"+number1 +"Value of Number2 :"+number2);
  }
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }
}
