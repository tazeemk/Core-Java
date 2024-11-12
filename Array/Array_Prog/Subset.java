package Array_Prog;

import java.util.Arrays;

public class Subset
{
    public static void main(String[] args) {
        int[] arr1={2,1,3,4,5,6};
       int[]  arr2={8,2,3,4,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int x =Arrays.compare(arr1,arr2);
        System.out.println(x);
    /*   for (int i=0;i<=arr1.length-1;i++){
           for (int j=0;j<=arr2.length-1;j++){
               if (arr1[i]==arr2[j]){
                   System.out.println("ARR2 IS SUBSET OF ARR1");
           }else {
                   System.out.println("ARR2 IS NOT SUBSET OF ARR1");
               }
       }
    }*/
}
}
