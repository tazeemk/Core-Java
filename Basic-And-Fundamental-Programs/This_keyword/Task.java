package This_keyword;

import java.util.Arrays;

public class Task
{
    int x;
    void meth(){
        int arr[]=new int[6];

        String ss[];
        ss = new String[6];

        double demo[]={566.6,565.5};

        String name ="sanu";
        System.out.println("arr length ::"+arr.length);
        System.out.println("demo "+demo.length);

        System.out.println( Arrays.toString(demo));
        System.out.println(demo[demo.length-1]); // array  index check

     for(int i=0;i<=demo.length-1;i++){
         System.out.println("for loop :: " +arr[i]);
     }
     for(double data:demo)
     {
         System.out.println(data);
     }


    }

    public static void main(String[] args)
    {
        //new Task(5).display();
        new Task().meth();
    }
}
