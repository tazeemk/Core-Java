package This_keyword;

public class this_use2
{
//it is used to call present class method
// And we cannot use static keyword inside static area

void meth1()
{
    System.out.println("meth1 called");
}
 static void meth2(){
     System.out.println("meth2 called");
    // meth1();//C.E because we cannot use static keyword inside staic area
              //by default compiler add this keyword if we are not write this keyword to call method

 }
 void meth3(){
    this.meth1();
    //this.meth2();//we can call static method through this keyword from non -static method
                 //but it is highly recommendable to call static method with the help of class name
     this_use2.meth2();
     System.out.println("meth3 called");
 }

    public static void main(String[] args) {
     new this_use2().meth3();
   //  this.meth3();//C.E because we cannot use this keyword inside static area
    }
}
