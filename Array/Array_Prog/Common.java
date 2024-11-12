package Array_Prog;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

    public class Common {
    public static void main(String[] args) {

    String duplicate = "java is awesome";

    for (int i=0;i<=duplicate.length()-1;i++)
    {
       for (int j=0;j<=duplicate.length()-1;j++){
           if (duplicate.charAt(i)==duplicate.charAt(j)){
               System.out.println(duplicate.charAt(i));
           }
       }
    }
    }
}