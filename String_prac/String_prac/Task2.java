package String_prac;

public class Task2
{
public String makeAbba(String a, String b)
{
return a+b+b+a;

}

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        String res =t2.makeAbba("Devang","Gandu");
        System.out.println(res);
    }
}
/*
QUESTION ::

        Given two strings, a and b, return the result of putting them together in the order ab-ba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

        makeAbba("Hi", "Bye") ? "HiByeByeHi"
        makeAbba("Yo", "Alice") ? "YoAliceAliceYo"
        makeAbba("What", "Up") ? "WhatUpUpWhat"
*/