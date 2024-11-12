package Core_Java_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8_lambda
{
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(5);
        al.add(212);
        al.add(90);
        al.add(17);
        al.add(2);
                  Stream<Integer>s1=al.stream().filter(data-> data>100);
              Set<Integer>s2 =s1.collect(Collectors.toSet());
        System.out.println(s2);
    }
}
