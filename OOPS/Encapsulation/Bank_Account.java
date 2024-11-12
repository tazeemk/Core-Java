package OOPS.Encapsulation;

public class Bank_Account
{
    private double Acount_Number;
    private int otp;

    public double getAcount_Number() {
        return Acount_Number;
    }

    public void setAcount_Number(double acount_Number) {
        Acount_Number = acount_Number;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;


}
