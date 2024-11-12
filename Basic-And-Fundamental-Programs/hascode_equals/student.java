package hascode_equals;

import java.util.Objects;

public class student
{
    int rollNo;
    String name;
    double fees;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollNo == student.rollNo && Double.compare(fees, student.fees) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, fees);
    }

    public  student(int rollNo, String name, double fees) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
public String toString(){
    return rollNo+" "+name+" "+fees;
        }
    }

