package Collection.List.LinkedList;

public class Employee
{
String empName;
int empSal;

    public Employee(String empName, int empSal)
    {
        this.empName = empName;
        this.empSal = empSal;
    }

    @Override
    public String toString()
    {
        return empName ;
    }
}
