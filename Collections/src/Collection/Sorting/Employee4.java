package Collection.Sorting;

public class Employee4
{
    private String EmailId;
     private String name;
  private   int password;

    public Employee4(String emailId, String name, int password)
    {
        EmailId = emailId;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return EmailId + " "+ name +" " + " "+ password ;
    }

    public String getEmailId()
    {
        return EmailId;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }
}
