package InnerClass;

public class ImplAnonymousInner implements Addition
{
    //Anonymous Inner class have not any name  it is class with no name
    //it is create for providing definition of a normal class,abstract class,Interfaces
    //suppose we override a abstract method from interface the we can implement that method only one time
    //in extend class aur child class if we need to write more implementation of that abstract method than we
    // need to use AnonymousInner class
public  int Addition(int a, int b){

    return a;
}
 static Addition a = new Addition() {
    @Override
    public int Addition(int x, int y) {
        return 0;
    }
    
 //   Addition a = ImplAnonymousInner.Addition(66,56);
};

}
