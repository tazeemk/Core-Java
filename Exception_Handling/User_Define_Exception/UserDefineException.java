package Exception_Handling.User_Define_Exception;

import java.util.Scanner;

public class UserDefineException
{
    static double current_balance = 555;

    public static void main(String[] args)throws MinimumAccountBalance
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the amount to withdraw ::");
        try {
            if (current_balance<=n){
                 throw new MinimumAccountBalance("insufficient fund :your current balance is "+n);
            }
        }catch (MinimumAccountBalance e)
        {
            System.out.println("hi");
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
