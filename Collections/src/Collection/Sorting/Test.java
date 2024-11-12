package Collection.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Test
{
    public void meth1(){
        int arr[]={34,23,90,23,22,3};
        System.out.println("Before Sorting "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting :"+Arrays.toString(arr));
        System.out.println("Lowest Element :"+arr[0]);
        System.out.println("Largest Element :"+arr[arr.length-1]);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.meth1();
    }
}
