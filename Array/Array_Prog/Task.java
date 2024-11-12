package Array_Prog;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task {
    public static void main(String[] args) {

   int[]arr={7,3,9,9};
   int[]ar={6,3,9,2,9,4};
    Arrays.sort(arr);
    Arrays.sort(ar);
    //Remove Duplicate From array using stream API
    int[] arr1= IntStream.of(arr).distinct().toArray();
    int[] arr2=IntStream.of(ar).distinct().toArray();
    int count=0;

           for (int i=0;i<=arr2.length-1;i++)
           {
           for (int j=0;j<=arr1.length-1;j++){

               if (arr1[j]==arr2[i]){
                   System.out.println(arr1[j]);
                   count++;
               }

           }

           }

        System.out.println("total :"+count);


    }

}