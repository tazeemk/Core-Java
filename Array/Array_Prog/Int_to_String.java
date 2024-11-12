package Array_Prog;

import java.util.Arrays;
import java.util.Locale;

public class Int_to_String
{
    public static void main(String[] args) {

        String A="hello ";
        String B="java";

        System.out.println("Length is :"+A.concat(B).length());
  String C = A.substring(0,1).toUpperCase()+A.substring(1).concat(B.substring(0,1).toUpperCase()+B.substring(1));
        System.out.println(C);
    }
}
