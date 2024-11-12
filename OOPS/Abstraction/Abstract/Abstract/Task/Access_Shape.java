package OOPS.Abstraction.Abstract.Abstract.Task;

public class Access_Shape extends Circle
{

    void Display(){
        System.out.println("1.PRESS TO CHECK CIRCLE AREA ::");
        System.out.println("2.PRESS TO CHECK RECTANGLE AREA ::");
        int i = sc.nextInt();
        switch (i) {
            case 1 -> {
                Circle c = new Access_Shape();
                System.out.println(c.calculateArea());
            }
            case 2 -> {
                Rectangle r = new Rectangle();
                System.out.println(r.calculateArea());
            }
            default -> System.out.println("Enter valid input ::");
        }
}
    public static void main(String[] args) {
        new Access_Shape().Display();

    }
}
