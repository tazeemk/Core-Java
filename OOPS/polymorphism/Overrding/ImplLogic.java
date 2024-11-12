package OOPS.polymorphism.Overrding;
import OOPS.polymorphism.MathOperation;

import java.lang.*;
public class ImplLogic extends  MathOperation
{

    public int Area(int sum){
        return sum;
    }
    public double square(int a){
        return a;
    }

    

    public static void main(String[] args) {
        MathOperation im  = new MathOperation();

    }

}
