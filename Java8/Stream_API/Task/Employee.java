package Java8.Stream_API.Task;

public class Employee implements Comparable<Employee>
{
    String empName;
    int empAge;
    double empSal;

    public Employee(String empName, int empAge, int empSal)
    {
        this.empName = empName;
        this.empAge = empAge;
        this.empSal = empSal;
    }

    @Override
    public String toString()
    {
        return  empName +" "+ empAge +" "+ empSal ;
    }
  @Override
  public int compareTo(Employee o)
  {
  return (int) (this.empSal-o.empSal);
  }

}
