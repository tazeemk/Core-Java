package Collection.Map;

public class Employee
{
    String empName ;
    int empSal;
    String empDept;

    public Employee(String empName, int empSal, String empDept)
    {
        this.empName = empName;
        this.empSal = empSal;
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return  empName +" "+ empSal +" "+ empDept ;
    }
}
