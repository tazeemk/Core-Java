package OOPS.polymorphism;

public class MathOperation
{
    int addNumber(int a,int b){
       return a+b;
    }
    double addNumber(double a,double b){
        return a+b;
    }
    //this method takes two string as input and return those after concatenation
    String addNumber(String a,String b){


        return a+b;
    }

    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println("a = 20, b = 30 :"+m.addNumber(20,30));
        System.out.println("a = 20.9, b = 30.7 :"+m.addNumber(20.9,30.7));
        System.out.println("a =java, b = is awesome :"+m.addNumber("java ","is awesome"));
        System.out.println(""+m.addNumbers(new int[]{10,20,30,40}));
    }
      int addNumbers(int[] numbers){
        // we can add array with the help of its index position
          //and hold is values in a primitive data types
          int i = numbers[0] + numbers[1]+numbers[2]+numbers[3];
          return i;
       }

}

