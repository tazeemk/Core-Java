package String_prac;

import java.util.Arrays;

public class Example
{
    void review()
    {
        System.out.println("\n Method review called::");
        String val1 ="Kishan Sir Is Awesome";
        String val2 =new String("Kishan Sir Is Awesome");
        String val3 ="Kishan Sir Is Awesome";
        String val4 = new String("Kishan Sir Is Awesome");
// equal() compare the content of the strings
        System.out.println("equals()  :"+val1.equals(val2));
        System.out.println("equals()  :"+val1.equals(val3));
        System.out.println("equals()  :"+val2.equals(val4));
        System.out.println("equals()  :"+"kishan sir is awesome".equals(val2));
        System.out.println("equals()  :"+"kishan sir is awesome".equalsIgnoreCase(val2));
        System.out.println("===========================================================");
//== is used to compare memory locations of the String
        System.out.println(val1==val2);//f
        System.out.println(val1==val3);//t
        System.out.println(val2==val2);//t
        System.out.println(val2==val4);//f
        System.out.println("Kishan Sir Is Awesome"==(val1));//t
        System.out.println(new String("java")==new String("java"));//f
//length() is give total length of the string

        System.out.println("\nlength()  :"+val1.length());
        System.out.println("length()  :"+val3.length());
//conact
        System.out.println("\n"+val2.concat(" "+val1.concat(" He is best teacher is the world")));
        System.out.println(val1.concat(" Best Trainer ").length());
        System.out.println("val1 :"+val1 );
    }
    void meth2()
    {
        System.out.println("\n IMPLEMENTING STRING CLASS METHODS::");
    String sval =" Your Parent is waiting for your success ";
    //charAt() is used to see which element have on the given  index position of the string
        System.out.println("CharAt :"+sval.charAt(1));
        System.out.println("CharAt :"+sval.charAt(sval.length()-1));
        System.out.println("CharAt :"+sval.charAt(sval.length()-3));

        /*
        here charAt gives character value to scanner
          Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST LETTER OF THE SUBJECT ::");
        char subject = sc.next().charAt(0);
        switch (subject)
        {
            case 'c','C':
                System.out.println("Core Java ");
                System.out.println("CSS ");
                break;
            case 's','S':
                System.out.println("Spring ");
                System.out.println("spring boot");
                break;
            default:{
                System.out.println("data not found::");
            }
        } */

        String sval2 =" DEVANG ";
        System.out.println("lowercase :"+sval2.toLowerCase());
        System.out.println("uppercase :"+sval2.toUpperCase());
        System.out.println("\n");

 
        //getbyte() is used to convert string into byte or character form
         byte arr[] =sval2.getBytes();//IO STREAM
        System.out.println(Arrays.toString(arr));
        for (byte b:arr){
            System.out.println((char)b);
        }

        //split() is used to break string into word
        System.out.println("\n");
       String sval3="11-may-2001";
         String arr2[] = sval3.split("-");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);
        System.out.println("\n");


         String sval4 ="I LOVE INDIA";
        System.out.println(Arrays.toString(sval4.split("")));
        System.out.println(Arrays.toString(sval4.split(" ")));
        System.out.println((sval4.charAt(0)));

        //===========substring=======
    //Substring is used to provide value from given index position to end of element
        String sval5 =" AKAADKULA ";
        System.out.println("\nsubstring() ::"+sval5.substring(2));
        System.out.println("substring two parameters() :"+sval5.substring(2,5));

//indexof()
        System.out.println("indexof() :"+sval5.indexOf('A'));
        System.out.println("indexoflast() :"+sval5.lastIndexOf('A'));

 //replace()
        System.out.println("\nreplace() "+sval5.replace('A','B'));

    //trum() method
        System.out.println("trim() :"+sval5.trim().length());

        //startswith()
        System.out.println("\n startswith() ::"+sval4.startsWith("k"));
    }

    public static void main(String[] args) {
        Example e = new Example();
        //e.review();
        //System.out.println("------------------");
        e.meth2();
    }


}
