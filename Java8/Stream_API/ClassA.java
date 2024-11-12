package Java8.Stream_API;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassA
{
    void Meth1(){
        System.out.println("Implementing Stream forEach()-method  :");
        ArrayList<Integer>al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);
        /* System.out.println("\nRetrieving data by Iterator interface:");
                Iterator<Integer> i=al.iterator();
                while (i.hasNext()){
                    System.out.print(i.next()+" ");
                }*/
   //we can retrieve data from foreach() method in just one line
        System.out.println("\nRetrieving elements by using forEach()-method :");
               al.forEach(data-> System.out.print(data+" "));
    }
    void meth2(){
        System.out.println("Implementing Stream Filtering :");
        ArrayList<String>al = new ArrayList<String>();
        al.add("Priya");
        al.add("Sujatha");
        al.add("Simmi");
        al.add("Critein");
        al.add("Swati");

      /*  Stream<String>s1=al.stream();       //1st way
        Stream<String>s2= s1.filter(data-> data.length()<=5);
                          long l  =s2.count();

       */

      //  long l =al.stream().filter(data-> data.length()<=5).count();//2nd way
        System.out.println("\nThere are "+al.stream().filter(data-> data.length()<=5).count()+" elements which is less than or equal to 5 ");
         //3rd way
    }
    void meth3()
    {
        System.out.println("Implementing map() to manipilate data : ");
        ArrayList<Integer>al = new ArrayList<Integer>();
        al.add(2);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(9);
        al.add(6);
        al.add(9);
        System.out.println(al);
        al.parallelStream();
       long l =al.stream().filter(data->data.equals(9)).count();
        System.out.println("l value:"+l);
    List<Integer>li  = al.stream().sorted().collect(Collectors.toList());
     List<Integer>lo=  al.stream().map(data->
       { if(data>5){

              return data+2;
           }else{


       return data+5;
       }

               }).toList();
        System.out.println("After mnipulation :"+lo);
        Stream<Integer> s1=al.stream().map(data->
        {
         if (data%2==0){

             return data*2;
         }
         else{
             return data*5;
         }
        });
     //   List<Integer>li=s1.collect(Collectors.toList());
       // System.out.println(li);
    }
    void meth4(){
        System.out.println("Sorting Data Through StreamAPI");
        ArrayList<Integer>al= new ArrayList<>();
        al.add(60);
        al.add(22);
        al.add(90);
        al.add(888);
        al.add(10);
        //System.out.println("Before :"+al);
      //  Collections.sort(al);//by using collection class:
       // System.out.println("Sorting data by using StreamAPI");
        //Stream<Integer>s1=al.stream().sorted();
       // List<Integer> list=s1.collect(Collectors.toList());
        //System.out.println("After sorting :"+list);
        //System.out.println("Sorting LinkedHashSet by using StreamAPI :");
        LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
        lhs.add(90);
        lhs.add(34);
        lhs.add(4);
        lhs.add(55);
        lhs.add(32);
        lhs.add(23);
        System.out.println("Before sorting :"+lhs);
       Stream<Integer> s2=lhs.stream().sorted();
       List<Integer> li =s2.collect(Collectors.toList());
        System.out.println("After sorting :"+li);
    }

    public static void main(String[] args)
    {
       ClassA aobj= new ClassA();
      // aobj.Meth1();
        //aobj.meth2();
        aobj.meth3();
   // aobj.meth4();
    }
}
