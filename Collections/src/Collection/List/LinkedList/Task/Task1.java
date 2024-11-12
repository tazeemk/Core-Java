package Collection.List.LinkedList.Task;

import Collection.List.LinkedList.Employee;

import java.util.*;
import java.util.Objects;

public class Task1 {
    void meth1() {

        LinkedList<String> l = new LinkedList<String>();
LinkedList<String>l1 = new LinkedList<String>();
        l.add("java");
        l.add(".net");
        l.add("Spring");
        l.add("Aws");
        l.add("html");
        l.add("css");
        l.add("javascript");
        l.add("microservices");
        System.out.println("\nPrinting Element which is not having word a");
        String str = " ";
        for (int i = 0; i <= l.size()-1; i++) {

            {
                str = l.get(i);

               if (str.contains("a")||str.contains("A") )
                {
                 l1.add(str);

               } else {
                    System.out.println(str);
                }
            }
        }
        System.out.println("\nRemoving Elements :"+l1);
    }
    public static void main(String[] args) {
        Task1 t = new Task1();
        t.meth1();
    }
}