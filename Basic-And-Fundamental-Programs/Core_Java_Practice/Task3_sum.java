package Core_Java_Practice;


public class Task3_sum
{
    int num =12345;
    int sum=0;
    void sum()
    {

        while (num !=0)
        {

        sum+=num%10;
        num=num/10;
        }
        System.out.println("sum "+sum);

    }

    public static void main(String[] args) {
       new Task3_sum().sum();
    }
}
