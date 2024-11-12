package Array_Prog;

import java.util.*;

public class Tcs
{
    public static void main(String[] args) {
        String input = "java8 is good ";
        char c[] = input.toCharArray();
        int count = 1;
        HashMap<Character, Integer> hs = new HashMap<>();
        for (Character in:c) {
            hs.put(in, 2);
        }
        HashSet<Character> as = new HashSet<>(hs.keySet());
           for (Character we:as){
               System.out.println(we);
           }



/*        for (char in:c)
        {

                if (in!=' ' )
                {
                    System.out.println(in);
                    hs.put(in,1);
                }
            }
        for (Map.Entry<Character,Integer>entry:hs.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }*/
    }
}
