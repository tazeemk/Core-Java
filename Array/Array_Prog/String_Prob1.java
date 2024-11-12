package Array_Prog;

import java.util.Arrays;

public class String_Prob1
{
    public static void main(String[] args) {
        String msg="He is very very good boy isn't he";
        String[] oper;
        try {
        int count=0;
            System.out.println(count);
        for (int i=0;i<=msg.length();i++){
              oper =msg.split(" ");

            System.out.println(oper[i]);
          count++;
        }

    }catch (Exception e){
            System.out.println(" ");
        }
    }
}
