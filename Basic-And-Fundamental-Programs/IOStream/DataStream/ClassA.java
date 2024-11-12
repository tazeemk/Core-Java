package IOStream.DataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA
{
    public void meth()throws Exception
    {//Transferring primitive datatype into file . to provide more secure
        System.out.println("Writing PD into a File :");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\JavaIO\\text7.txt"));
        System.out.println("Connection Created ::");
        dos.writeInt(5555);
        dos.writeChar('D');
        dos.writeBoolean(true);
        System.out.println("Data written successfully in file :");
          dos.close();
        System.out.println("Reading PD from File :");
         DataInputStream dis = new DataInputStream(new FileInputStream("C:\\JavaIO\\text7.txt"));
        System.out.println("Connection Created ::");
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());

        //order should be maintained in which order we passing element
        //that order we should retrieve element
        dis.close();



    }

    public static void main(String[] args)throws Exception
    {
        ClassA aobj = new ClassA();
        aobj.meth();
    }
}
