package OOPS.Abstraction.Abstract.Interface.Task;

public class Cat implements Animal
{
    @Override
    public void eat(){
        System.out.println("Cats like Milk");
    }

    @Override
    public void sleep(){
        System.out.println("Cats Not Sleep more ::");
    }
    @Override
    public void makeSound(){
        System.out.println(" Cats Make Sound le meow ::");

    }
    public void play(){
        System.out.println("Cats Plays with Hairs");
    }
}
