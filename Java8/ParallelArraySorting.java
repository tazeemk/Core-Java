package Java8;

import java.util.Arrays;

public class ParallelArraySorting
{
    void meth1(){
        System.out.println("Implementing ParallelArraySorting :");
        int arr[]={3,4,9,5,6,2,1,8,7};
       // Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));//it sort array from begining to end
        System.out.println("Before sort :"+Arrays.toString(arr));
        Arrays.parallelSort(arr,2,5);//it sort data from index position 2 to 5
        System.out.println("After parallel sort :"+Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
       new ParallelArraySorting().meth1();
    }

}
