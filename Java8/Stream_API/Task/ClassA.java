package Java8.Stream_API.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassA
{
    void Task()
    {
        Employee emp1 = new Employee("Devang",20,150000);
        Employee emp2 = new Employee("Sahid",32,90000);
        Employee emp3 = new Employee("Sanu",27,77000);
        System.out.println("Task of StreamAPI :");
        ArrayList<Employee>al = new ArrayList<Employee>();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
        System.out.println("=======Before Employee Details======= :");
        al.forEach(obj-> System.out.println(obj));
        Collections.sort(al);
        System.out.println("\n******************************************");
        System.out.println("Employee Details After Increment and Sorting of salary :\n");
        Stream<Object> s1 =al.stream().map(data->{

            if (data.empAge>=25)
            {
                return data.empName +" "+ data.empAge+" " + (data.empSal + data.empSal*0.1);
            }
            else {
                return data.empName+" "+data.empAge+" "+data.empSal;
            }
        });
        List<Object>li=s1.collect(Collectors.toList());
        li.forEach(dat-> System.out.println(dat));
      // Stream<Object> s2=li.stream().sorted();
        //List<Object>l=s2.collect(Collectors.toList());



    }

    public static void main(String[] args) {
        new ClassA().Task();
    }
}
