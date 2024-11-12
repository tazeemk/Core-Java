package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;



public class Example
{

    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
       /* list.add(12);
        list.add(33);
        list.add(33);
        list.add(634);
        list.add(71);
        list.add(33);
        list.add(74);
        list.add(944);*/
        list.stream().findFirst().ifPresentOrElse((Consumer<? super Integer>) System.out::println,System.out::checkError);
        //System.out.println(l1);


      //   List<String>l= list.stream().map(s-> s +" ").filter(w->w.startsWith("1")).toList();

    }

}
