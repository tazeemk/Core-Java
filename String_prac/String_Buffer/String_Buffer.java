package String_prac.String_Buffer;

public class String_Buffer
{
    void meth1()
    {
        System.out.println("meth1() called \n");
        String s = "java";
        System.out.println("===========before=============");
        StringBuffer buffer1 = new StringBuffer("sanu");
        StringBuilder builder1 = new StringBuilder("devang");
        System.out.println( s.concat(" is awesome ::"));
        buffer1.append(" is awesome :");
        builder1.append(" is awesome ::");
        System.out.println("=================after=================");
        System.out.println("s value ::"+s);
        System.out.println("buffer1 :: "+buffer1);
        System.out.println("builder1 :: "+builder1);
        System.out.println("========================================");
        System.out.println("IMPLEMENTING EQUALS OPERATOR ::");
        String s1 ="java";
        StringBuffer buffer2 = new StringBuffer("sanu");
        StringBuilder builder2= new StringBuilder("java");
        System.out.println(s.equals(s1));
        // IN BUFFER AND BUILDER CLASS EQUALS METHOD IS USED TO COMPARE ADDRESS
        //LOCATIONS
        System.out.println(buffer1.equals(buffer2));
        System.out.println(builder1.equals(builder2));

        System.out.println("======================================");
        System.out.println(buffer1==buffer2);

        buffer1.append(" he is handsome boy ::");
        System.out.println(buffer1);


    }
    void meth2()
    {
String s3 = "java";
StringBuffer buffer3 = new StringBuffer(" devang is handsome boy ");
StringBuilder builder3 = new StringBuilder(" devang is handsome boy ");
StringBuffer buffer4 = new StringBuffer(" devang is handsome boy ");
StringBuilder builder4 = new StringBuilder(" devang is handsome boy ");

// COMPARE THE ADDRESS content OF BUFFER AND BUILDER CLASSES
 System.out.println(buffer3.toString().equals(buffer4.toString()));

    }

    public static void main(String[] args) {
        String_Buffer b1 = new String_Buffer();
        //b1.meth1();
           b1.meth2();
    }




}
