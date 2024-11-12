package Collection.List.ArrayList;

import java.util.Objects;

public class UserDefineObj
{
    String empName;
    int empSal;
    String empDept;
    public UserDefineObj(String empName,int empSal,String empDept)
    {
        this.empName=empName;
        this.empSal=empSal;
        this.empDept=empDept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDefineObj that = (UserDefineObj) o;
        return empSal == that.empSal;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empSal);
    }

    @Override
    public String toString(){
        return empName +" "+empSal +" "+empDept;
    }
}
