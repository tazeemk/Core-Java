package Array_Prog;

public class Task6
{
    public static void main(String[] args) {
        int i=10;
        int x=1;
        int fact=1;
        for (int n=i;n>=1;n--)
        {

            fact*=x;
            x++;
        }
        System.out.println(fact);
    }
}
