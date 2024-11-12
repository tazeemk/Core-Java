package String_prac;

public class Task5
{
public String firstTwo(String str){
try {


    return str.substring(0, 2);
}catch (StringIndexOutOfBoundsException e){
    return "invalid input";
}
}

    public static void main(String[] args) {
        Task5 t5 = new Task5();
        String res = t5.firstTwo("devang");
        System.out.println(res);
    }
}



/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

firstTwoGiven a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

firstTwo("Hello") ? "He"
firstTwo("abcdefg") ? "ab"
firstTwo("ab")  ? "He"
firstTwo("abcdefg") ? "ab"
firstTwo("ab") ? "ab"

 */