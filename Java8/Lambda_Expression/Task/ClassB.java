package Java8.Lambda_Expression.Task;

public class ClassB
{
    String empName;
    int empSal;

    public ClassB(String empName, int empSal)
    {
        this.empName = empName;
        this.empSal = empSal;
    }


    public static void main(String[] args) {


        Interface1 a = (x)->{
           if (x.equalsIgnoreCase(" "))
               return "String is Empty";
           else
               return "String is not empty :"+x;
        } ;
        System.out.println(a.givenCheck(" "));
    }
}
