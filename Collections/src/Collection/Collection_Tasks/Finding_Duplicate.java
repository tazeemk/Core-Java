package Collection.Collection_Tasks;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.Callable;

public class Finding_Duplicate
{
    public static void main(String[] args) {
      //  List<Emp1>l1= new LinkedList<>();
        Set<Emp1>h1=new HashSet<>();
        Emp1 e1=new Emp1("Devang",100);
        Emp1 e2=new Emp1("vang",330);
        Emp1 e3=new Emp1("evang",900);
        Emp1 e4=new Emp1("ang",3300);
        Emp1 e5=new Emp1("ng",200);
                  h1.add(e1);
                  h1.add(e2);
                  h1.add(e3);
                  h1.add(e4);
                  h1.add(e5);
                  TreeSet<Object>ts= new TreeSet<>(h1);

        System.out.println(ts);

       /*   h1.add(10);
          h1.add(10);
          h1.add(30);
          h1.add(33);
          h1.add(10);*/


       // System.out.println(h1);

    }
}
