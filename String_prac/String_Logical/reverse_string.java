package String_Logical;

public class reverse_string
{
    public static void main(String[] args) {
        String msg="devang";
        String rev=" ";
        for (int i=msg.length()-1;i>=0;i--)
        {
                 rev+=msg.charAt(i);

        }
        //System.out.println(msg);
        System.out.println(rev);
    }
}
