package Array_Prog;

import java.sql.Savepoint;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Project1
{
    static Scanner sc = new Scanner(System.in);
  //static int[] result;
   static int k;
    int sum;

    void Grade() {
        System.out.println("WELCOME TO THE STUDENT GRADE MANAGEMENT SYSTEM::");

        int no = 0;
        System.out.println("Enter the numbers of students :: ");
        int stu = sc.nextInt();
        int student[] = new int[stu];
        int slno = 1;


        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the grade of student " + slno);
            student[i] = sc.nextInt();
            slno++;


        }
        int sum = Arrays.stream(student).sum();
        System.out.println(Arrays.toString(student));
        System.out.println(sum);
        System.out.println(student.length);
        //int avg[] = student;
        //int av = avg.length;
        //  System.out.println(Arrays.stream(avg).sum());
        // System.out.println("average::"+k);


            System.out.println("Menu::");
            System.out.println("1. View all grade ");
            System.out.println("2. View Average grade ");
            System.out.println("3. View Highest grade ");
            System.out.println("4. View Lowest grade ");
            System.out.println("5. Return To menu ");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("All grades are :: " + Arrays.toString(student));
                    Grade();
                }
                case 2: {
                    System.out.println("Average Grades are " + Arrays.stream(student).sum() / student.length);

                }
                case 3: {
                    Arrays.sort(student);
                    System.out.println("Highest Grade is :" + student[student.length - 1]);
                    break;
                }
                case 4: {
                    Arrays.sort(student);
                    System.out.println("Lowest Grade is :" + student[0]);
                }
                case 5: {

                }

            }
        }


    public static void main(String[] args) {
        new Project1().Grade();
    }

}