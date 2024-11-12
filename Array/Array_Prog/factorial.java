package Array_Prog;

public class factorial
{
    public static void main(String[] args)
    {
        int x=10;
        int i=1;
        int fact=1;

        while (i<=x){

            fact*=i;
          //  System.out.println(fact);
            i++;
        }
        System.out.println(fact);
    }
}
