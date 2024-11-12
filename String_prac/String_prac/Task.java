package String_prac;

import java.util.Arrays;
import java.util.Scanner;

public class Task
{


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        try (sc;){
            System.out.println("Enter The Value  ");
            String msg = sc.nextLine();
            int vowels=0;
            int consunent=0;

            for (int i=0;i<msg.length();i++){
                char ch = msg.charAt(i);
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                     vowels++;
                   char c = msg.charAt(i);
                    System.out.print(c + " ");
                    c++;


                }else {

                    consunent++;
                   char con = msg.charAt(i);


                }
            }
            System.out.println("voweles :"+vowels);
            System.out.println("consunent :"+consunent);

           // System.out.println(a.length);
           // System.out.println(Arrays.toString(a));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
