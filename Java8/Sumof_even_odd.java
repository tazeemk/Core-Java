package Java8_Practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sumof_even_odd
{
    public static void main(String[] args) {

        List<Integer>al=new ArrayList<>();
        al.add(30);
        al.add(22);
        al.add(33);
        al.add(21);
        al.add(10);
        al.add(90);

      int sum =al.stream().filter(data->data%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even elements:"+sum);

        int odd=al.stream().filter(data->data%2==1).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of odd elements :"+odd);

        //Second lowest  element in the list

        Integer s1= al.stream().distinct().sorted().skip(1).findFirst().orElse(null);

        System.out.println("Second Smallest :"+s1);

        //Finding Second Highest Number in the list :
        Integer s2=al.stream().distinct().sorted((a,b)->Integer.compare (b,a)).skip(1).findFirst().orElse(null);

        System.out.println("Second Highest :"+s2);
      Integer a=al.stream().findFirst().orElse(null);
      List<Integer>m = al.stream().sorted((c,b)->Integer.compare(b,c)).collect(Collectors.toList());
        System.out.println(m);
        al.stream().max((x,y)->Integer.compare(x,y));
        System.out.println("Firts element "+a);
    }
}
