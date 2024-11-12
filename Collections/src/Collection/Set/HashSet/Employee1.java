package Collection.Set.HashSet;

public class Employee1 implements Comparable<Employee1>
{
    String empName;
    double empSal;
    int empDept;

    public Employee1(String empName, double empSal, int empDept) {
        this.empName = empName;
        this.empSal = empSal;
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return  empName + " " +empSal +" "+ empDept ;
    }
    @Override
    public int compareTo(Employee1 o)
    {
    return  o.empDept-this.empDept;
    }
}
