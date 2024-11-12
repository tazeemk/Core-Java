package OOPS.polymorphism;
import java.lang.String;
import java.util.Arrays;

public class Overridding1 {
   // @Override
 //public String toString(){
   //  return "devang";
 //}
    String toLowerCase(){
        return "MUSA KAREEM ";
    }

// static String s ="java";

    public static void main(String[] args) {
        Overridding1 o = new Overridding1();
        System.out.println(o);
        System.out.println(o.toString());

        System.out.println( o.toLowerCase());

    }
}
