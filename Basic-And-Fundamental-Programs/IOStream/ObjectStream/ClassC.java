package IOStream.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassC
{
    public void FileOperation1()throws Exception
    {
        System.out.println("Serilization ");
        //means Transferring Object into file
        ClassA aobj1 = new ClassA();
        System.out.println("aobj1 :"+aobj1.a +" "+aobj1.b);
        ClassB bobj1 = new ClassB();
        System.out.println("bobj1 :"+bobj1.x +" "+bobj1.y);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\JavaIO\\obj.ser"));
        System.out.println("Connection Created :");
        oos.writeObject(aobj1);
        oos.writeObject(bobj1);
        oos.close();
        System.out.println("DE-serilazation :");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\JavaIO\\obj.ser"));
        System.out.println("Connection Created :");
       ClassA aobj2 =(ClassA)ois.readObject();
        ClassB bobj2 =(ClassB)ois.readObject();
        System.out.println("aobj2 :"+aobj1.a +" "+aobj1.b);
        System.out.println("bobj2 :"+bobj1.x +" "+bobj1.y);
ois.close();
    }

    public static void main(String[] args)throws Exception {
        ClassC cobj = new ClassC();
        cobj.FileOperation1();
    }
}
