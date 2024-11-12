package Array_Prog;

import java.util.Arrays;

public class Count_String
{
    public static void main(String[] args)
    {
        String msg="HELLO JAVA Awesome and sanu is awesome";
        System.out.println("Counting string words :");
        System.out.println("Counting string Characters :");
                 int count=0;

        for (int i=0;i<=msg.length()-1;i++)
        {
        //for counting word    //System.out.println("counting :"+s[i]);
           if (msg.charAt(i)!=' ') {
               count++;
           }
        }
        System.out.println("Counting String :"+count);
    }
}
