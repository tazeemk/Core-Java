package OOPS.Abstraction.Abstract.Interface.Task;

public class Dog implements Animal,Trainable
{
    public void eat(){
        System.out.println("Dogs Eats Anything They Found ::");

    }
   public void sleep(){
       System.out.println("Dogs Sleeps In Streets::");
    }
    public void makeSound(){
        System.out.println("Dogs Makes Sound Like Bhauu ::");

    }
    public void play(){
        System.out.println("Dogs Play with bolls");
    }
    public void train(){
        System.out.println("Dogs will Trained They will listening Everything ::");
    }
}
