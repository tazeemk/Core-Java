package hascode_equals;

public class hascde
{
    public static void main(String[] args) {
        student s1 = new student(101,"Devang",22000000);
       student s2 = new student(101,"Devang",22000000);
        System.out.println("s1  : "+s1.hashCode());
        System.out.println("s2  : "+s2.hashCode());
     //   System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1);

    }
}
