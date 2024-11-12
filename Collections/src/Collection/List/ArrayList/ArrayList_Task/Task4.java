package Collection.List.ArrayList.ArrayList_Task;

import java.util.ArrayList;

public class Task4
{
    public void ArrayListOperation()
    {
    //Create ArrayList of Integer and remove Even Numbers From it
        ArrayList<Integer>al1 = new ArrayList<>();
        al1.add(12);
        al1.add(23);
        al1.add(2);
        al1.add(3);
        al1.add(33);
        al1.add(20);
        al1.add(13);
        al1.add(30);
        al1.add(20);
        System.out.println("EVEN NUMBERS ARE ::" );
        //HERE RETRIVENING ARRAYLIST DATA INTO INT DATA ANG CHECKING EVEN CONDITION
        for (int i =0;i<=al1.size()-1;i++)
        {
              int a = al1.get(i);
              if (a%2==0)
              {
                  System.out.print(a +" ");
              }
        }


    }

    public static void main(String[] args) {
        Task4 t4 = new Task4();
        t4.ArrayListOperation();
    }
}
