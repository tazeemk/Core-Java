package Array_Prog;

import java.util.Scanner;

public class Task5
{
    static Scanner sc = new Scanner(System.in);
    public boolean commonEnd(int[] a, int[] b)
    {
        int m =1;
        int n =1;
        for (int i=0;i<a.length;i++) {
            System.out.println("ENTER THE "+m+" VALUES::");
            a[i] = sc.nextInt();
            m++;
            //System.out.println("first array  filled");
            for (int j=0;j<b.length;j++)
            {
                System.out.println("ENTER THE "+n+ "VALUE  ");
                b[j] = sc.nextInt();

                if (a[a.length - 1] == b[b.length - 1]) {
                    return true;
                }
            }
        }
  return false;
    }

    public static void main(String[] args) {
        Task5 t = new Task5();
        System.out.println("ENTER LENGTH FOR FIRST ARRAY ::");
        int input1[]= new int[sc.nextInt()];
        System.out.println("ENTER LENGHT FOR SECOND ARRAY::");
        int input2[]=new int[sc.nextInt()];
        boolean result = t.commonEnd(input1,input2);
        System.out.println(result);
    }
 }

/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) ? true
        commonEnd([1, 2, 3], [7, 3, 2]) ? false
        commonEnd([1, 2, 3], [1, 3]) ? true
*/