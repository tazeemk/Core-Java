package String_prac;

import java.util.Arrays;

public class Task8 {
    void meth() {
        String s = "devang is awesome";

        //byte b[]=s.getBytes();
        //for (byte d:b){
          //  System.out.println((char)d);
        //}
       // System.out.println(Arrays.toString(b));
      //  System.out.println(s.startsWith("deva"));
        //System.out.println(s.indexOf("van"));
        //System.out.println(Arrays.toString(s.split(" ")));
        String str = new String("DEVANG IS FUCKER::");
        System.out.println(Arrays.toString(str.split(" ")));
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    public static void main(String[] args) {
        Task8 s = new Task8();
        s.meth();
    }
}