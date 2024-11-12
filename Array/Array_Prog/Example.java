package Array_Prog;

import java.util.Arrays;

public class Example
{
    public static void main(String[] args)
    {
     int[] arr={2,1,4,4,3,1,3,2,6,7};
     // int[] ar  = Arrays.parallelSort(arr,3,arr.length-1);
       int[] ar=Arrays.stream(arr).filter(data-> data>=3).sorted().toArray();
        System.out.println(Arrays.toString(ar));
    }
}
