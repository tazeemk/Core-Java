package OOPS.polymorphism;

public class Rectangle extends Shape
{
    @Override
    double calculateArea(){
        System.out.println("CALCULATE AREA OF RECTANGLE ::");
        System.out.println("Enter The Length of Rectangle ::");
        double l = sc.nextDouble();
        System.out.println("Enter the Width of the Rectangle ::");
        double w = sc.nextDouble();
        return l * w;
    }
}
