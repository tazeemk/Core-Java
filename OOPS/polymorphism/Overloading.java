package OOPS.polymorphism;

import java.util.Arrays;

public class Overloading
{
    //writing two or more method in the same class having same name but different parameter
    //  also known as compile time polymorphism
    final void meth1(int a){
        System.out.println("int one parameterized method::");
    }
     private void meth1(int x,float y){
         System.out.println("two parameterized ");

      }
         public int meth1(String s){
    System.out.println("string one parameter");
                    return 3;
        }
        public void meth1(float m,int[] y){
    System.out.println("double one parameter");
            System.out.println(Arrays.toString(y));
         }
         static void meth1(char c){
    System.out.println("char one parameter");

          }void meth1(boolean b){
    System.out.println("boolean one parameter");

         }  void meth1() {

    System.out.println("without parameter method ::");
             }
    public void meth3(String a,int... arr){
        System.out.println("double one parameter");
      //  System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.meth1();
        obj.meth1(39,new int[]{58,59,98,49,78,});
   obj.meth3("hi",9,4,54,56,54,45,65,45,654,654,56);

    }
}
