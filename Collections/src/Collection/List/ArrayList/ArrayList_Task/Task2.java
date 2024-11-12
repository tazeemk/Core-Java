package Collection.List.ArrayList.ArrayList_Task;

import java.util.ArrayList;

public class Task2
{
    public void meth1()
    {
        //Create ArrayList Of Integer And five Number to it
        //ArrayList of Integer Type
        ArrayList<Integer>al1 = new ArrayList<>();
        //Passing value in Array list
        al1.add(100);//1st value
        al1.add(200);//2nd value
        al1.add(300);//3rd value
        al1.add(400);//4th value
        al1.add(10);//5th value
        //Now printing value in consle by using for-each loop
        for (Object a :al1)
        {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        //Calling my ArrayList
        t2.meth1();
    }
}
