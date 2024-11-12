package Java8.OptionalClass;

import java.util.Arrays;
import java.util.Optional;

public class ClassA {
    void meth1() {
        String arr[] = new String[5];
        arr[1] ="kishan";
        arr[2]="java";
      //  System.out.println(arr[0].toUpperCase());
        Optional<String>o=Optional.ofNullable(arr[1]);
       // System.out.println(o);
    if(o.isPresent()){
        System.out.println("Data is present :");
        System.out.println(o.get());
    }else{
        System.out.println("Data is Empty :");
    }
        System.out.println("\n");
 for(String s :arr)
 {
     Optional<String>m = Optional.ofNullable(s);
     //System.out.println(m);
     if(m.isPresent()){
         System.out.println(m.get().toUpperCase());
     }

 }
    }


    public static void main(String[] args) {
        new ClassA().meth1();
    }
}