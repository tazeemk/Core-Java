package String_Logical;

import java.util.Arrays;

public class swap_char
{
    public static void main(String[] args) {
        String swap="devang";

        char[] arr =swap.toCharArray();
    char c = arr[arr.length-1];
    char d=  arr[0];

        arr[0]=c;
        arr[arr.length-1]=d;
        System.out.println(c);
        System.out.println(d);
        System.out.println(Arrays.toString(arr));
    }
}
