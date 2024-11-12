package Collection.List.Vector;


import java.util.*;

public class ClassA
{
     void VectorOperations() {

         Vector<Object> v = new Vector<Object>();
         v.add(10);//insertation order is maintain
         v.add("java");//Heterogeneous data is allowed
         v.add("is");
         v.add(null);//null is allowed
         v.add(100);
         v.add(10);//duplicate is allowed
         v.add(230);//available from java 1.0v
         v.add(500);//default Size is 10
         v.add('A');//size increase by double
         v.add(false);//It is synchronized
         v.add(10.99);
         v.add(300);
         v.add("awesome");
         v.add("End");
         System.out.println("v  :" + v);
         System.out.println("\nsize() :" + v.size());
         System.out.println("capacity() :" + v.capacity());
         v.add(0, 1000);
         v.add(v.size() - 1, 200);
         v.add(v.size(), "Not Now");//Adding to last block.
         v.add("id");
         v.add("roll no");
         v.add(111.22);
         v.add("End");
         System.out.println("\n v :" + v);
         System.out.println("\n size() :" + v.size());
         System.out.println("capacity() :" + v.capacity());
         v.set(7, true);
         System.out.println("v :" + v);
         System.out.println("Retrieving Data in both direction By using for-loop :");
         for (int i = 0; i <= v.size() - 1; i++) {
             System.out.print(v.get(i) + " ");
         }
         System.out.println();
         for (int i = v.size() - 1; i >= 0; i--) {
             System.out.print(v.get(i) + " ");
         }

         System.out.println("\n\nRetrieving data by using for-each loop :");
         for (Object o : v) {
             System.out.print(o + " ");
         }
         System.out.println("\n\nRetrieving data by using Enumeration Interface :");
         Enumeration<Object> e = v.elements();
         while (e.hasMoreElements()) {
             System.out.print(e.nextElement() + " ");
         }
         System.out.println("\n\nRetrieving data by using Iterator Interface :");

         Iterator<Object> i = v.iterator();
         while (i.hasNext()) {
             System.out.print(i.next() + " ");
         }
         //Passing Vector Elements in Arraylist as a parameter :
         ArrayList<Object> al = new ArrayList<Object>(v);//Easy Way
         System.out.println("\n\nVector :" + v);
         System.out.println("ArrayList :" + al);
         //al.addAll(v);//2nd way

     }
     void meth2(Vector<Employee>emp)
     {
         Enumeration<Employee>e1 = emp.elements();
         int totalSal=0;
         while (e1.hasMoreElements())
         {
             Employee em =e1.nextElement();

             totalSal +=em.sal;


         }
         double AvgSal=totalSal/emp.size();
         System.out.println("AverageSalary  :"+AvgSal );
     }
    public static void main(String[] args) {
        ClassA aobj = new ClassA();
     //   aobj.VectorOperations();
        Employee emp1 = new Employee("Devang ",12000);
        Employee emp2 = new Employee("Sanu ",123000);
        Employee emp3 = new Employee("sahil ",51000);
        Vector<Employee>v1 = new Vector<Employee>();
        v1.add(emp1);
        v1.add(emp2);
        v1.add(emp3);
        aobj.meth2(v1);

    }
}
