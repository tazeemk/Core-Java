package OOPS.Encapsulation;

public class ClassA
{
   private String empName;
    private int empId;
    private int empAge;
    private String empDept;
    public void setEmpName(String empName)
    {
     this.empName =empName;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
    public int getEmpId(){
        return empId;
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpDept(String empDept){
        this.empDept=empDept;
    }
    public String getEmpDept(){
        return empDept;
    }

}
