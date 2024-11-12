package Collection.Sorting;


public class Employee5  implements Comparable<Employee5>
{
    String empName;
    int emSal;
    String empDept;

    public Employee5(String empName, int emSal, String empDept)
    {
        this.empName = empName;
        this.emSal = emSal;
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return empName +" " + emSal + " " + empDept;
    }

    @Override
    public int compareTo(Employee5 o)
    {
       // return this.emSal-o.emSal;//sorting empsal wise
    return this.empDept.compareTo(o.empDept);//sorting empDept wise
    }
}
