package IOStream.ByteIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class ClassA
{
    void FileOperation1()throws Exception {
        System.out.println("READING DATA FROM FILE ");
        FileInputStream fis = new FileInputStream("C:\\JavaIO\\text1.txt ");//Creating object
        System.out.println("CONNECTION CREATED:");
        int i;
        while ((i = fis.read()) != -1)//TRANSFERRING FIS OBJECT VALUE IN I VARIABLE AND IF I = -1 THEN LOOP TERIMINATE
        {

            System.out.println(i);
        }
        System.out.println("Date Retrieve ....");
        fis.close();
    }
    void FileOperation2()throws Exception
    {
        System.out.println("WRITING DATA ON FILE:");
        //Here Creating empty file in our system
        FileOutputStream fos = new FileOutputStream("C:\\JavaIO\\text2.txt",true);
        System.out.println("CONNECTION CREATED :");
        String s =" ,He is Real Hero : ";//Creating data
        byte arr[]=s.getBytes();//converting it into byte form
         fos.write(arr);//Uploading data into file
       // System.out.println(Arrays.toString(arr));
        System.out.println("File Updated Successfully ::");
fos.close();
    }
    void FileOperation3()throws Exception
    {
        System.out.println("COPYING DATA FROM FROM ONE FILE TO ANOTHER FILE :");
        FileInputStream fis = new FileInputStream("C:\\JavaIO\\text2.txt ");
        FileOutputStream fos = new FileOutputStream("C:\\JavaIO\\text1.txt");
        System.out.println("CONNECTION CREATED :");
        int i;
        while ((i=fis.read())!=-1)
        {
         fos.write(i);
        }
        System.out.println("DATA TRANSFERRED SUCCESSFULLY.....");
        fis.close();
        fos.close();
    }

    public static void main(String[] args)throws Exception
    {
        ClassA aobj = new ClassA();
        //aobj.FileOperation1();
       // aobj.FileOperation2();
      aobj.FileOperation3();
    }
}
