package This_keyword;

public class this_use1 {
    // it is used to resolve the ambiguity between instance variable and local variable
    int x=10;
    static int y=20;
    void meth1(){
        System.out.println("meth1 called::");
        int x=100;
        int y=200;
        System.out.println("Instance variable :"+this.x);
        System.out.println("static  variable :"+this_use1.y);
        System.out.println("Local variable x :"+ x +" y "+ y);
    }

    public static void main(String[] args) {
        new this_use1().meth1();
    }
}
