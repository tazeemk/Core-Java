package OOPS.Encapsulation;

public class M {
    private String empName;
    static private int empExp;

    private double empSal;
    //empSal=  5 / 100 * (empExp);

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpExp(int empExp) {
        this.empExp = empExp;

    }


    public int getEmpExp() {
        return empExp;
    }

    public void setEmpSal(double empSal) {


        this.empSal=empSal;

    }

    public double getEmpSal() {
        if (M.empExp >= 10)
            return  empSal + (30.0/100 * empSal);
        else
            return empSal + (5.0/ 100) * empSal;


    }
}
