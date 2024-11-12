package String_prac;

public class Task3
{
public String makeOutWordGiven(String out,String word)
{

return out.substring(0,2) +word +out.substring(2);
}

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        String res =t3.makeOutWordGiven("<<>>","sanu");
        System.out.println(res);

    }
}



/*
QUESTION::

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".

makeOutWord("<<>>", "Yay") ? "<<Yay>>"
makeOutWord("<<>>", "WooHoo") ? "<<WooHoo>>"
makeOutWord("[[]]", "word") ? "[[word]]"



 */