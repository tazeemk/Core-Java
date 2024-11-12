package OOPS.Abstraction.Abstract.Interface.Task;

public class Main
{
    public static void main(String[] args) {


        Animal aobj = new Cat();
        aobj.eat();
        aobj.sleep();
        aobj.makeSound();
        aobj.play();
        System.out.println("=====================");
        Animal bobj = new Dog();
        bobj.eat();
        bobj.sleep();
        bobj.makeSound();
        bobj.play();
        Trainable tobj = new Dog();
        tobj.train();
    }
}
