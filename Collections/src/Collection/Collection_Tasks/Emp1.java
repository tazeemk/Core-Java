package Collection.Collection_Tasks;


import java.util.Objects;

public class Emp1 implements Comparable<Emp1>
{
    String empName;
    int empSal;

    public Emp1(String empName, int empSal)
    {
        this.empName = empName;
        this.empSal = empSal;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp1 emp1 = (Emp1) o;
        return Objects.equals(empName, emp1.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empName);
    }

    @Override
    public String toString() {
        return empName + "   " + empSal ;
    }


    @Override
    public int compareTo( Emp1 o) {
        return this.empSal-o.empSal;
    }
}
