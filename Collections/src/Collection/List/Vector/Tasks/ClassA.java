package Collection.List.Vector.Tasks;

public class ClassA
{
    String empName;
    int empId;
    String empDept;

    public ClassA(String empName, int empId, String empDept)
    {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return empName  ;
    }
}
