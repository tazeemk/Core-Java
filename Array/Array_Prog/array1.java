package Array_Prog;

import java.util.Arrays;
import java.util.List;

public class array1 {
    void meth1() {

        int arr1[];
        arr1 = new int[5];

        int arr2[] = new int[5];

         int arr3[] = {30, 60, 10, 20,15,30,40,20};
         int arr4[] = new int[]{11, 22, 33, 44, 55, 66};
        System.out.println("\n arr1 :" + arr1);
        System.out.println(" arr2 :" + arr2); //compiler by default calling to string method
        System.out.println(" arr3 :" + arr3);
        System.out.println(" arr4 :" + arr4 +"\n");

        System.out.println("\n arr1 length " + arr1.length);
        System.out.println(" arr2 length :" + arr2.length);
        System.out.println(" arr3 length :" + arr3.length);//to see length of our array use final length variable
        System.out.println(" arr4 length :" + arr4.length);
        String s = "JAVA";

        //System.out.println("/n arr1 length " + arr1.length);
        //System.out.println("/n arr2 length :" + arr2.length);
        //System.out.println("/n arr3 length :" + arr3.length);//to see length of our array use final length variable
       // System.out.println("/n arr4 length :" + arr4.length);
        //System.out.println("string s length" + s.length());//length() is used to check string length
        //System.out.println("-------------------------------------/n");

        //System.out.println("BOTH ARRAY AND ARRAYS CLASS ARE DIFFERENT ");
        //System.out.println("ARRAY CLASS HAVE NO METHOD SUPPORT WHILE ARRAYS CLASS HAVE METHOD SUPPORT");
        //System.out.println("------------------------------------------------------------------/n");

        //System.out.println(" TO SEE VIEW OF OUR ARRAY USE  toString() method present in arrays class");

        //System.out.println("/n arr1 length " + Arrays.toString(arr1));
        //System.out.println("/n arr2 length :" + Arrays.toString(arr2));
        //System.out.println("/n arr3 lenght :" + Arrays.toString(arr3));//to see length of our array use final length variable
        //System.out.println("/n arr4 lenght :" + Arrays.toString(arr4));
        Arrays.sort(arr3);
        System.out.println("sorting of array  ===::" +Arrays.toString(arr3));
         List  list =List.of(arr3);
       //  list.stream().forEach(System.out::println);
        System.out.println("Array to list");
        for(int i =0;i<list.size();i++)
        {
            System.out.println("list for loop call::");
             System.out.println(list.get(i));

        }
        System.out.println("list for loop end");
// to check index position of an array
        System.out.println("\n index arr1" +arr1[0]);
        System.out.println("\n index arr2" +arr2[arr1.length -2 ]);
        System.out.println("\n index arr1" +arr3[2]);
        System.out.println("\n index arr1" +arr4[arr3.length-3]);
        System.out.println("\n index arr1" +arr4[arr4.length/2]);
        //System.out.println(arr1[6]);//IT generate arrayoutofbound exception

        arr1[2]=25;
        arr1[4] = 35;
        arr1[arr1.length-2] =35;
        System.out.println("arr1 "+Arrays.toString(arr1));
    }
    void meth2()
    {
        System.out.println("\n meth2 called");
        String names[]={"sanu","devang","sahil","sahid"};
        System.out.println(Arrays.toString(names));
        float table[] = new float[7];
        System.out.println("\n retrieving arr by using for loop ");

        for(int i=0; i<=names.length-1;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("\n Retrieving data in reverse form through for loop" );

        for(int i = names.length-1;i>=0;i--){
            System.out.print(names[i]);
        }
        System.out.println("retrieving data form for-each loop");
        System.out.println("\n");
        for(String data:names){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
  array1 aobj = new array1();
    aobj.meth1();
     //   aobj.meth2();
    }
}



