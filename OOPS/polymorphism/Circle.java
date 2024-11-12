package OOPS.polymorphism;

import java.util.concurrent.Callable;

public class Circle extends Rectangle {
    @Override
    double calculateArea() {
      //  super.calculateArea();
        System.out.println("CALCULATE AREA OF CIRCLE :: ");
        System.out.println("Enter The Radius  of Circle ::");
        double r = sc.nextDouble();

        return 3.14 * (r*r);

    }

    public static void main(String[] args) {
       Rectangle robj = new Circle();
        System.out.println(robj.calculateArea());
        Shape sobj = new Rectangle();
        System.out.println(sobj.calculateArea());
      ;
    }
}