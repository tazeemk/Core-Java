package Array_Prog;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Repeating_Element {
    public static void main(String[] args) {
        System.out.println("Repeating Element in Array :");
        int[] arr = {2, 1, 3, 4, 5, 3, 3, 2, 2, 6, 7, 8, 9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=1; i <= arr.length-1; i++) {

            if (arr[i] == arr[i-1]) {
                System.out.println(arr[i]);

            }

        }
    }
}
