package Collection.List.Vector;

public class Employee
{
    String empName;
    int sal;

    public Employee(String empName, int sal)
    {
        this.empName = empName;
        this.sal = sal;
    }


    @Override
    public String toString() {
        return empName +" " + sal ;
    }
}
