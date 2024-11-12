package Collection.List.Vector.Tasks;

import java.util.ArrayList;
import java.util.Vector;
public class ClassB
{

    public Vector<ClassA>meth1(ArrayList<ClassA>al)
    {
      Vector<ClassA>v1 = new Vector<ClassA>(al);


       return v1;
    }

    public static void main(String[] args)
    {

        ClassB bobj = new ClassB();
        ClassA emp1 = new ClassA("devang ",101,"Cheif General");
        ClassA emp2 = new ClassA("sanu ",102," General");
        ClassA emp3 = new ClassA("bob ",103,"Cheif Commander");
        ClassA emp4 = new ClassA("nitin ",104,"Solider");
        ClassA emp5 = new ClassA("ava ",105,"Commander");
        ArrayList<ClassA>al1 = new ArrayList<ClassA>();
        al1.add(emp1);
        al1.add(emp2);
        al1.add(emp3);
        al1.add(emp4);
        al1.add(emp5);
        Vector<ClassA> result =bobj.meth1(al1);
  String op =" ";
  int count =0;
             for (int i=0;i<=result.size()-1;i++) {
                 op = String.valueOf(result.get(i));
                 if (op.charAt(0)==op.charAt(op.length()-2))
                 {
                     System.out.println("palendrome :"+op);
                     count++;
                 }else {
                     System.out.println("non Palendrome :"+op);
                 }


             }
        System.out.println("Palendrome are :"+count);


     }

        }



