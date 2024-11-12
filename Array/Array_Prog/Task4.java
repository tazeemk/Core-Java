package Array_Prog;

import java.util.Arrays;
import java.util.Scanner;

public class Task4
{
    static Scanner sc = new Scanner(System.in);
    boolean firstlast(int []nums) {
        System.out.println("firstlast method call");
        int j=1;
        for (int i=0;i<nums.length ;i++ )
        {
            System.out.println("ENTER FIRST VALUE"+j+ " VALUE");
             nums[i]=sc.nextInt();
            j++;
           // System.out.println(Arrays.toString(nums));
            if (nums[0] == 6 && nums[nums.length - 1] == 6) {
                return true;

            }

        }
        System.out.println(Arrays.toString(nums));
        return false;
    }
    public static void main(String[] args) {
        Task4 t = new Task4();
        System.out.println("ENTER THE LENGTH OF ARRAY ::");
        int result[]=new int[sc.nextInt()];
       boolean res =t.firstlast(result);
       System.out.println(res);


    }
}
