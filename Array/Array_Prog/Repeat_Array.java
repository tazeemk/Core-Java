package Array_Prog;

import java.util.Arrays;

public class Repeat_Array
{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,10,10,20,30,20,40};
   int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++) {
                int count =1;
            while (i<n-1&&arr[i]==arr[i+1]){
               i++;
            count++;
            }
            System.out.println(arr[i] +" count "+count);
            count++;
        }
    }
}
