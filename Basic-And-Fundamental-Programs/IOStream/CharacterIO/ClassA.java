package IOStream.CharacterIO;

import java.io.FileReader;
import java.io.FileWriter;

public class ClassA
{
     public void FileOperation1()throws Exception
     {
         System.out.println("Reading Data from File Through Character Stream :");
         FileReader fr = new FileReader("C:\\JavaIO\\text2.txt ");
         System.out.println("Connection Created ::");
         int i;
         while ((i=fr.read())!=-1)
         {
             System.out.print((char)i);
         }
         fr.close();
     }
     public void FileOpearation2()throws Exception
     {
         System.out.println("Writing data in file through character stream :");
         FileWriter fw = new FileWriter("C:\\JavaIO\\text2.txt",true);
         String s = ",Devang is supreme leader :";
                 fw.write(s);
                 fw.close();
         System.out.println("Data Uploaded Successfully.....");
     }
     public void FileOperation3()throws Exception
     {
         System.out.println("Copying data Through Character stream :");
         FileReader fr = new FileReader("C:\\JavaIO\\text2.txt");
         FileWriter fw = new FileWriter("C:\\JavaIO\\text3.txt",true);
         int i;
         while ((i=fr.read())!=-1)
         {
          fw.write(i);
         }
         System.out.println("Copying successfully...");
         fr.close();
         fw.close();
     }

    public static void main(String[] args)throws Exception
    {
        ClassA aobj = new ClassA();
       // aobj.FileOperation1();
        //aobj.FileOpearation2();
    aobj.FileOperation3();
    }
}
