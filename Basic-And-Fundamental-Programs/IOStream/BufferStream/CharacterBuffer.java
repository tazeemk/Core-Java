package IOStream.BufferStream;

import java.io.*;

public class CharacterBuffer
{


        public void Operation()throws Exception
        {
            System.out.println("Reading Data from File Through BufferCharacter :");
            BufferedReader br = new BufferedReader(new FileReader("C:\\JavaIO\\text5.txt"));
            System.out.println("Connection Created :");
            int i;
            while ((i=br.read())!=-1)
            {
                System.out.print((char)i);
            }
            br.close();
        }
        public void Operation2()throws Exception
        {
            System.out.println("Writing data in file Through BufferCharacter :");
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JavaIO\\text5.txt",true));

            String s =",IS STRONGER :: ";
            bw.write(s);
            System.out.println("Buffered Write Successfully...");
           // bw.flush();//used to transfer data from buffer to storage
            bw.close();//or close obj then also data go from buffer to storage
        }
        public void FileOpeation3()throws Exception
        {
            System.out.println("COPYING FILE THROUGH BUFFFER :");
            BufferedReader nis = new BufferedReader(new FileReader("C:\\JavaIO\\text5.txt"));
            BufferedWriter bos = new BufferedWriter(new FileWriter("C:\\JavaIO\\text6.txt "));
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
            IOStream.BufferStream.ByteBuffer bb = new IOStream.BufferStream.ByteBuffer();
            //bb.Operation();
            bb.Operation2();
            //bb.FileOpeation3();
        }
    }


