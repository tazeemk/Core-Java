package Collection.Set.TreeSet;

public class Employee2
{
    String empName;
    int empSal;

    public Employee2(String empName,int empSal )
    {
        this.empName = empName;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return empName+" "+empSal  ;
    }
   /* @Override
    public int compareTo(Employee2 o)
    {

        return this.empName.compareTo(o.empName);
    }*/
}
