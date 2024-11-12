package IOStream.BufferStream;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class ByteBuffer
{
    public void Operation()throws Exception
    {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\JavaIO\\text5.txt"));
        int i;
        while ((i=bis.read())!=-1)
        {
            System.out.print((char)i);
        }
    }
    public void Operation2()throws Exception
    {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\JavaIO\\text5.txt",true));
       String s =",Musa Kareem ";
        bos.write(s.getBytes());
        System.out.println("Buffered Write Successfully...");
        bos.flush();//used to transfer data from buffer to storage
        bos.close();//or close obj then also data go from buffer to storage
    }
    public void FileOpeation3()throws Exception
    {
        System.out.println("COPYING FILE THROUGH BUFFFER :");
        BufferedInputStream nis = new BufferedInputStream(new FileInputStream("C:\\JavaIO\\text5.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\JavaIO\\text6.txt "));
        System.out.println("Connection Created ::");
        int i;
        while ((i=nis.read())!=-1){
            bos.write(i);
        }
                nis.close();
                bos.close();
        System.out.println("Data Copying Successfully....");
    }


    public static void main(String[] args)throws Exception
    {
        ByteBuffer bb = new ByteBuffer();
        //bb.Operation();
        //bb.Operation2();
        bb.FileOpeation3();
    }
}
