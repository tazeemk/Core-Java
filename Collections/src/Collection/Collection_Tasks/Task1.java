package Collection.Collection_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task1
{
    public static void main(String[] args) {

        ArrayList<String>al = new ArrayList<>();
        al.add("devang");
        al.add("sanu");
        al.add("sahid");
        al.add("sahid");

    al.forEach(data-> System.out.println(data));
        Stream<String>s1=al.stream();
      Stream<String> s2 = s1.map(data-> {
   if(data.length()>4)
       return data.concat(" :Gendu");
   else{


   return data.concat(" :Muhme le");
   }
        });
        s2.forEach(da-> System.out.println(da));

        Stream s=al.stream().filter(data->{
         if(data.toCharArray().equals('a')) {

             return Boolean.parseBoolean(data);
         }else {
         return true;
         }
        });
        s.forEach(dat-> System.out.println(dat));
    }
}
