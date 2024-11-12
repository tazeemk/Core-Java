package Array_Prog;

public class Rint
{
    public static void main(String[] args) {
        String msg="java is 9 kksi";
        String remove=" ";

        for (int i=0;i<=msg.length()-1;i++)
        {
        if(msg.charAt(i)<=65&&msg.charAt(i)>=90)
            {
                 remove+=msg.charAt(i);
        }

        }
        System.out.println(remove);
    }
}
