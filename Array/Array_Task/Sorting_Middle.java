package Array_Task;

import java.util.Arrays;

public class Sorting_Middle
{
    public static void main(String[] args)
    {

        int arr[]={4,8,7,3,2,9,6,1};
        int num =arr.length/2;
        System.out.println(num);
        for (int i=0;i<=num-1;i++)
        {
            System.out.println(arr[i]);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }


    }
}
