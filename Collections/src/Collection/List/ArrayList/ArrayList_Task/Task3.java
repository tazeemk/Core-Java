package Collection.List.ArrayList.ArrayList_Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3
{
    public void ArrayListOperation()
    {
        Scanner sc = new Scanner(System.in);
        //Creating ArrayList of String type
        ArrayList<String>al1 = new ArrayList<>();
        //TAKING VALUE FROM USER BY USING SCANNER CLASS
        System.out.println("ENTER THE FIRST STRING VALUE :");
        al1.add(sc.next());
        System.out.println("ENTER THE SECOND STRING VALUE :");
        al1.add(sc.next());
        System.out.println("ENTER THE THIRD STRING VALUE :");
        al1.add(sc.next());
        System.out.println("ENTER THE FOURTH STRING VALUE :");
        al1.add(sc.next());
        System.out.println("ENTER THE FIFTH STRING VALUE :");
        al1.add(sc.next());

        System.out.println("PRINTING ARRAYLIST STRING VALUES\n");
        for (Object o:al1){
            System.out.print(o +" ");

        }
        sc.close();//Closing the resource
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        //Calling ArrayList
        t3.ArrayListOperation();
    }
}
