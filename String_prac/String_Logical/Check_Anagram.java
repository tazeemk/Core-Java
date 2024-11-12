package String_Logical;

import java.util.Arrays;

public class Check_Anagram
{
    public static void main(String[] args) {
        String msg="heart";
        String msg1="earth";
       char b1[] =msg.toLowerCase().toCharArray();
       char b2[]=msg1.toLowerCase().toCharArray();
       boolean status=false;
        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));
     status=Arrays.equals(b1,b2);
        if(status)
        {
        System.out.println(msg+" :and : "+msg1+" :Are Anagram :");
    }
        else{
            System.out.println("not a anagram :");
        }
    }
}
