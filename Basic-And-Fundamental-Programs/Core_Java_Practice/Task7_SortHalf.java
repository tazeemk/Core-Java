package Core_Java_Practice;

import java.util.Arrays;
import java.util.Collections;

public class Task7_SortHalf
{
    public static void main(String[] args) {
        Object arr[]={33,45,23,55,67,7,90,99,988};
        int half=(arr.length-1)/2;
        System.out.println(half);
   //    Arrays.parallelSort(arr,0,half);
       //Arrays.parallelSort(arr,half,arr.length-1);
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
