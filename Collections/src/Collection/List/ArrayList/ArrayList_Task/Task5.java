package Collection.List.ArrayList.ArrayList_Task;

import java.util.ArrayList;

public class Task5
{
    public void ArrayListOperation(){
          //Creating First ArrayList al1
        ArrayList<Integer>al1 = new ArrayList<>();
        al1.add(11);
        al1.add(22);
        al1.add(33);
        al1.add(44);
        //Creating Second ArrayList al2
        ArrayList<Integer>al2 = new ArrayList<>();
        al2.add(55);
        al2.add(66);
        al2.add(77);
        al2.add(88);
        //Creating third ArrayList al3
        ArrayList<Integer>al3 = new ArrayList<>();
        al3.addAll(al1);//Adding all elements of al1 in al3 using addAll method
        al3.addAll(al2);//Adding all elements of al2 in al3 using addAll method
        //System.out.println(al3);
        System.out.println("Size of ArrayList al3 :"+al3.size());
        //Retrieving ArrayList al3 elements by using for loop
        for (int i=0;i<=al3.size()-1; i++)
        {

            System.out.println(al3.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Task5 t5 = new Task5();
        t5.ArrayListOperation();
    }
}
