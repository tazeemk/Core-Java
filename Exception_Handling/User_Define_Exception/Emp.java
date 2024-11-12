package Exception_Handling.User_Define_Exception;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public  class Emp
{
    Scanner sc = new Scanner(System.in);
    String message;
Emp(String message){
    this.message=message;
}
 public String toString(){
    return message;
}

    public static void main(String[] args) {
       // Emp e = new Emp();
//        e.Credit(555);
    }
}
