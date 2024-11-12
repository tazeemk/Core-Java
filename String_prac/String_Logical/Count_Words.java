package String_Logical;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Words
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value :");
        String name= sc.nextLine();
        String arr[]=name.trim().split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);
    }

}
