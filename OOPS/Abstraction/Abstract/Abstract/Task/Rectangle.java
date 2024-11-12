package OOPS.Abstraction.Abstract.Abstract.Task;

public class Rectangle  extends Shape
{
    double calculateArea(){
        System.out.println("AREA OF RECTANGLE IS ::");
        Shape r = new Rectangle();
        System.out.println("Enter The Length  Of Rectangle ::");
        r.setL(sc.nextDouble());
        System.out.println("Enter The Width Of Rectangle ::");
        r.setB(sc.nextDouble());
        return r.getL() * r.getB();
    }
}
