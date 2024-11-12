package This_keyword;

public class this_use3
{
    //it is used to return INSTANCE of present class

    this_use3 meth1(){
        System.out.println("meth1 called");
        return this;
    }
    this_use3 meth2(){
        System.out.println("meth2 called");
        return this;
     }
  void meth3(){
      System.out.println("meth3 called");

  }

    public static void main(String[] args) {
        new this_use3().meth1().meth2().meth3();
    }

}
