package Collection;


import java.util.*;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Papaya");
        ll.add("Mango");
        ll.add("Orange");
        ll.add("Mango");
        System.out.println(ll);
        //ll.get(ll.indexOf("Mango"));
        // ll.remove("Mango");
        //   System.out.println(ll);


        Stream<String> s1 =ll.stream().filter(data-> data.equals("Mango"));

       // System.out.println(Arrays.toString(s1));
        ll.forEach(data-> System.out.print(data.equals("Mango")+" "));

    }
}