package Java8.Lambda_Expression.Task;

import java.util.*;

public class Task
{
        void Task1()
        {
       /*     System.out.println("Implementing ArrayList into Lambda Expression :");
            ArrayList<Integer> a = new ArrayList<>();
            a.add(10);
            a.add(20);
            a.add(50);
            Interface1 lb =(m,b)->
            {
                System.out.println("Array list :"+b);
                System.out.println("Int  :"+m);
            };
            lb.meth1(10,a);*/

        }
        void Task2()
        {
            Interface2 i2 = (a,b,c)->
            {
                System.out.println("int :"+a);
                System.out.println("String :"+b);
                System.out.println("char :"+c);

            };
            i2.meth2(20,"java is awesome",'A');

        }
        void Task3()
        {
            ClassB emp = new ClassB("devang",1000);
   Interface3 i3= (z,bobj)->
   {
       System.out.println("int value :"+z);
       System.out.println("ClassB object value :"+bobj.empName+" "+bobj.empSal);
   };
   i3.meth3(100,new ClassB("sanu",10000));
        }
        void Task4()
        {
            HashMap<Object,Object>map1= new HashMap<Object,Object>();
            map1.put(101,"devang");
            map1.put(102,"sanu ");
            map1.put("gandu","sahid");
            map1.put("bdadua","devang");
            map1.put(106,"devang");
            map1.put(108,"sahi");
            ArrayList<Integer>al = new ArrayList<Integer>();
            al.add(67);
            al.add(69);

            Interface4 i4 = (map2,al2)->
            {
              Iterator<Integer> i=al2.iterator();
              while (i.hasNext()){
                  System.out.print(i.next()+" ");
              }
                System.out.println("\n\nRetrieving HashMap elements :");
                HashSet<Object> hs = new HashSet<Object>(map2.entrySet());
                Iterator<Object> i1=hs.iterator();
                while (i1.hasNext()){
                    System.out.println(i1.next());
                }
            };
            i4.meth4(map1,al);

        }

        public static void main(String[] args) {
            Task t = new Task();
            //t.Task1();
          //  t.Task2();
           // t.Task3();
            t.Task4();
        }
    }


