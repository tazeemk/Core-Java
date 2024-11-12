package String_prac;

import java.util.Scanner;

public class Task6
{
    static Scanner sc = new Scanner(System.in);
public String firstHalf(String str)
{
return str.substring(0,str.length()/2);
}

    public static void main(String[] args) {
        Task6 t6 = new Task6();
        System.out.println("ENTER THE VALUE OF STR::");
        String res = t6.firstHalf(sc.next());
        System.out.println(res);
    }
}


/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") ? "Woo"
firstHalf("HelloThere") ? "Hello"
firstHalf("abcdef") ? "abc"

 */