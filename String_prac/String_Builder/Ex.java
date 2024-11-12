package String_prac.String_Builder;

import java.util.Arrays;

public class Ex
{
    StringBuilder sb = new StringBuilder("java is awesome");
    StringBuilder s = new StringBuilder("java is awesome");
    String sa ="java is awesome";
    void meth1(){
        System.out.println(sb.equals(s));
        //byte arr[]=sa.getBytes();
        //for (byte d:arr){
          //  System.out.println((char)d);
        //}
       // System.out.println(Arrays.toString( arr));

         String ar[]= sa.split(" ");
             sb.setLength(12);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Ex e = new Ex();
        e.meth1();
    }
}
