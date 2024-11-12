package OOPS.Abstraction.Abstract.Abstract.Task;

public class Circle extends Shape
{

void meth(){
    Shape s = new Circle();
    System.out.println("AREA OF CIRCLE IS ::");

    System.out.println("Enter The Radius Of Circle ::");
    s.setB(sc.nextDouble());
    System.out.println(s.getR());
}
    double calculateArea(){
           this.meth();
           return 3.14 * this.getR();

    }
}
