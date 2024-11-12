package Logical_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Nth_lastElement
{
   static int input;
    public static void main(String[] args)
    {
        List<Integer>l= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to add in ArrayList : Enter 'exit' when finished :");
/*     int n=1;
        while (true) {
            System.out.println("Enter the: " + n + "value");
            input = sc.nextInt();

            if (input == 0) {
                break;
            }
            l.add(input);
            n++;
        }*/
        System.out.println(l);
        System.out.println("Finding nth element to last element :");
        List<Integer>s1=l.stream().skip(3).collect(Collectors.toList());
        System.out.println(s1);
    }
}
