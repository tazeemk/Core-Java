package String_prac.String_Buffer;

public class buffer {
    void meth()
    {
        StringBuffer b = new StringBuffer("java is awesome ");

     //   System.out.println(i);
        StringBuffer s = new StringBuffer("java is awesome ");
        System.out.println(s.toString().equals(b.toString()));
        System.out.println("length of the string ::"+s.length());
        System.out.println("capacity of string ::"+s.capacity());
         s.append(" devang is fucker ");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(6));
        System.out.println(s.hashCode());
        s.hashCode();
 }


    public static void main(String[] args) {
        buffer a = new buffer();
      //  System.out.println(a);
        a.meth();

        //System.out.println(age);
        //System.out.println(a.equals(new buffer()));

    }
}