package hascode_equals;

public class Const
{
    public Const(){
        this(10);
        System.out.println("O param Constructor :");

    }
    public Const(int x){
        this(20,40);
        System.out.println("1 param Constructor : "+x);
    }
    public Const(int a ,int b){
        
        System.out.println("2 param Constructor :"+a +" "+b);
    }

    public static void main(String[] args) {
        Const c = new Const();
    }
}
