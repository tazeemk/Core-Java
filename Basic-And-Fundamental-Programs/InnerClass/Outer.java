package InnerClass;

public class Outer
{
    int m=66;

    static int y;
    public static void Display()
    {
        {

        }

    }
    static class inner
    {
          int x;
          static int y;
          inner(){
              System.out.println("inner class Constructor ::");
          }
          static void Inner()
          {
              int m;
              System.out.println("Static inner class ::");
              System.out.println("Non Static Variable ::"+new inner().x);
              System.out.println("Static Varaible of InnerClass :"+y);
             // System.out.println(" "+m);

          }
    }
}
