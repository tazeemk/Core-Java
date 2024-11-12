package OOPS.Abstraction.Abstract.Abstract;

public class Tiger extends Animal
{
public  void Eat(){
    System.out.println("Tiger Eats Flash");
}
public  void legs(String a){
    System.out.println("Tiger have Four legs");

}
public void Speed(){
    System.out.println("Tiger Runs 66 km/h");
}

    public static void main(String[] args) {
        Animal aobj = new Tiger();
        aobj.breadth();
        aobj.Eat();
        aobj.Speed();
        aobj.legs("h");
    }

}
