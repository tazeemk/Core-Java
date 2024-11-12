package Array_Task;

import java.util.Arrays;

public class Finding_Largest
{
    public static void main(String[] args) {
        int arr[]={5,8,3,4,6,2,1,9,3,5};
        int max=arr[0];
        for (int i=0;i<=arr.length-1;i++)
        {

           if(max<arr[i])
           {
               max=arr[i];
           }
        }
        System.out.println(max);
        int min=arr[0];
        System.out.println(min);
    }
}
