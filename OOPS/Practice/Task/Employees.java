package OOPS.Practice.Task;

public class Employees
{
    private String name;
    private String jobTitle;
    private int salary;
    Employees(String name,String jobTitle,int salary)
    {
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
