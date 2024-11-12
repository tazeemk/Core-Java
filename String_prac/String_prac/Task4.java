package String_prac;

public class Task4
{
public String extraEnd(String str)
{

     String s = str.substring(str.length()-2);
     return s+s+s;
}

    public static void main(String[] args) {
        Task4 t4 = new Task4();
        String res = t4.extraEnd("sanu");
        System.out.println(res);
    }

}


    /*  Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

        extraEnd("Hello") ? "lololo"
        extraEnd("ab") ? "ababab"
        extraEnd("Hi") ? "HiHiHi

     */