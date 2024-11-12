package Core_Java_Practice;

import java.util.Arrays;

public class Task5_Se_Smal_Array
{
    public static void main(String[] args) {
        int arr[]={6,33,90,40,30,20,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest :"+arr[0]);
        System.out.println("Largest :"+arr[arr.length-1]);
        System.out.println("Second Smallest :"+arr[1]);
    }
}
