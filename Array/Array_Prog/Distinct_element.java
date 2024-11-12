package Array_Prog;

import java.util.Arrays;

public class Distinct_element
{
    public static void main(String[] args) {
        int[] arr1={10,30,40,50};
        Arrays.sort(arr1);
        int sum=0;
    int[] arr2={2,4,5,1};
for (int i=arr2.length-1;i>=0;i--)
{
                  sum+=arr2[i]*arr1[i];

}
        System.out.println(sum);
    }
}

