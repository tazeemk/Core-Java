package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassX
{
    public static void main(String[] args) {

        int[] arr ={10,33,4,3};
        String[] names= new String[]{"sahid","devang","sanu"};
        //names[3]="sahil";


         List<Object> list1 = new ArrayList<>();
         list1.add(arr);
         list1.add(names);
        System.out.println(arr.hashCode());
        System.out.println(names.hashCode());
       Object[]g =list1.toArray();
        
       for (int i=0;i<=g.length-1;i++){
           System.out.println(g[i]);
       }


/*
        for ( Object m:g){
            System.out.println(Arrays.toString(m)+" ");
        }*/


        List<Object>obj = new ArrayList<>();
        obj.add(22);
        obj.add(33);

        System.out.println(obj.get(0));


    }


}
