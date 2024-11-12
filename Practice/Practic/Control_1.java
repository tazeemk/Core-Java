package Practic;

public class Control_1
{
    static int pmark=23;
     float total=70;
    float f;

    public int marks(int i)
    {
        System.out.println("Result of student");

        if(i>pmark)
        {
            System.out.println("passed and marks are:"+i);
            f=i/total*100;
            System.out.println("percentage ="+f);
        }
        else
        {
            System.out.println("failed!!");
        }
        return i;
    }

    public static void main(String[] args)
    {
        System.out.println("best of luck for your result ");
        Control_1 obj=new Control_1();
        obj.marks(44);
    }

}
