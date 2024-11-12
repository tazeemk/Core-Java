package IOStream.ByteIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Task1
{
    Scanner sc = new Scanner(System.in);
    void Perform()throws Exception {
        while (true) {
            System.out.println("ARE YOU STUDENT OR TRAINER :");
            System.out.println("Exit :");
            String name = sc.nextLine();
            switch (name) {
                case "Trainer", "trainer", "TRAINER": {
                    System.out.println("Enter Your Username :");
                    String un = sc.nextLine();
                    System.out.println("Enter Your Password :");
                    int ps = Integer.parseInt(sc.nextLine());
                    if (un == "Trainer" || ps == 12345) {
                        System.out.println("WELCOME " + un + " Enter your question :");
                        FileOutputStream fos = new FileOutputStream("C:\\JavaIO\\text4.txt", true);
                        String que = sc.nextLine();
                        byte arr[] = que.getBytes();
                        fos.write(arr);
                        System.out.println("Question Uploaded Successfully.....");
                        fos.close();
                    } else {
                        System.out.println("Invalid Username And Password :");
                    }

                    break;
                }
                case "Student", "student": {
                    System.out.println("Enter Your Username :");
                    String Usernm = sc.nextLine();
                    System.out.println("Enter Your Password :");
                    String pwd = sc.nextLine();
                    String s = "CoreJ@v@";
                    if (pwd.equals(s)) {
                        FileInputStream fis = new FileInputStream("C:\\JavaIO\\text4.txt");
                        int i;
                        while ((i = fis.read()) != -1) {
                            System.out.print((char) i);
                        }
                        System.out.println("\n");
                        System.out.println("Enter Your Answer :");
                        FileOutputStream fos = new FileOutputStream("C:\\JavaIO\\text4.txt", true);
                        String ans = sc.nextLine();
                       // System.out.println("PLEASE ENTER YOUR NAME :");
                        //ans.concat(sc.nextLine());
                        byte b[] = ans.getBytes();
                        fos.write(b);
                        System.out.println("Answer Submitted Successfully......");
                    } else {
                        System.out.println("INVALID PASSWRD :");
                    }
                    break;
                }
                    case "EXIT", "exit", "Exit": {
                        System.exit(0);
                        break;
                    }
                }
            }
        }


    public static void main(String[] args)throws Exception
    {
        Task1 t = new Task1();
        t.Perform();
    }
}
