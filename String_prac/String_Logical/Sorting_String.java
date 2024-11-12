package String_Logical;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_String
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String sort=sc.nextLine();
        String arr[]=sort.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
