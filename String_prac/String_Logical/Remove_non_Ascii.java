package String_Logical;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Remove_non_Ascii
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(word);
        word.replaceAll("[^\\p{ASCII}]"," ");
        System.out.println(word);
        StringTokenizer s= new StringTokenizer(word," ");
        System.out.println(s.countTokens());
    }
}
