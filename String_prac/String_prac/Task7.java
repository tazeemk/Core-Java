package String_prac;

public class Task7 {
    public Boolean ParendomCheck(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev))
            return true;
        return true;
    }



    public static void main(String[] args) {
        Task7 t7 = new Task7();
        t7.ParendomCheck("NANI");

    }
}



/*


Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") ? 1
countHi("ABChi hi") ? 2
countHi("hihi") ? 2

 */