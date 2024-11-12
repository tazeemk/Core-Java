package Array_Prog;

import java.util.Scanner;

public class Task1
{
    static Scanner sc = new Scanner(System.in);
    boolean FirstLast(int[] nums)
    {
        for (int data:nums){
            nums[nums.length-1]=sc.nextInt();
        }
        if (nums.length >=1  ) {
            if (nums[0] == nums[nums.length - 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Task1 aobj = new Task1();
        System.out.println("ENTER THE NUMBERS:: ");
        boolean result = aobj.FirstLast(new int[3]);
        System.out.println(result);
    }
}
