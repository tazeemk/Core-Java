package String_prac;

public class Task9
{
    String s = "java";
    String s1 ="java";
    StringBuffer sb = new StringBuffer("devang");
    StringBuffer sbc = new StringBuffer("devan");
    void meth(){
        System.out.println("meth called");
        System.out.println(s==s1);
        System.out.println(sb.toString().equals(sbc.toString()));
        System.out.println("calling equals method "+sb.equals(sbc));
    }

    public static void main(String[] args) {
        Task9 t = new Task9();
        t.meth();
        System.out.println(t.s.equals(t.s1));
    }
}
